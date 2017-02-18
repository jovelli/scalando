package com.jovelli.flickr.client

import org.specs2.mutable.Specification
import com.jovelli.flickr.client.FlickrClient.ClientError
import com.jovelli.flickr.client.HttpClient.{ GetError, GetResponse } 
import org.specs2.mock.Mockito
import com.jovelli.flickr.model.Foto
import com.typesafe.config.{ ConfigException, ConfigFactory }

class FlickrClientSpec extends Specification with Mockito {
  "FlickrClient fromConfig" should {
    "funcionar com conf correto" in {
      null ne FlickrClient.fromConfig(ConfigFactory.load("app-test.conf"))
    }
    
    "retornar erro com config faltando" in {
      FlickrClient.fromConfig(ConfigFactory.load("DoNotExist")) should throwA[ConfigException]
    }
  }
  
  "FlickrClient buscarFotos" should {
    "retornar Seq[Foto] depois de chamar HttpClient passando a Url" in {
      val fotos = List(Foto("1", "scala", "123", "123", 1, "scalas pic", true, false, true),
        Foto("2", "scala", "123", "123", 1, "scalas2 pic", true, false, true),
        Foto("3", "scala", "123", "123", 2, "scalas3 pic", true, false, true))
        
      val resp = buscarFotos(Right(GetResponse(200, "fotos-xml")), Right(fotos))
      
      resp should beRight(fotos)
    }
    
    "retornar erro ao receber xml com erro do Flickr" in {
      val flickrError = new FlickrKnownError(100, "Invalid API Key")
      val resp = buscarFotos(Right(GetResponse(200, "xml-error")), Left(flickrError))
      
      resp should beLeft(ClientError(flickrError.toString))
    }
  }
  
  def buscarFotos(httpResponse: Either[GetError, GetResponse],
    parsedBody: Either[FlickrError,
    Seq[Foto]]): Either[ClientError, Seq[Foto]] = {
    
    val httpClient = mock[HttpClient]
    val parser = mock[ResponseParser]
    
    httpClient.get(any[String]) returns httpResponse
    parser.parse(any[String]) returns parsedBody
    
    val client = new FlickrClient("api-key", "base-url", httpClient, parser)
    val resp = client.buscarFotos(List("scala"))
    
    there was one(httpClient).get(anyString)
    
    resp
  }    
}
