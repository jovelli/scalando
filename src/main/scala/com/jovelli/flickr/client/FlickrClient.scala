/** FlickrClient
* Object utilizado para carregar fotos do Flickr a partir de tags passadas
* 
*/
package com.jovelli.flickr.client

import com.jovelli.flickr.model.Foto
import com.typesafe.config.Config

class FlickrClient(apiKey: String, baseURL: String, httpClient: HttpClient, responseParser: ResponseParser) {
  
  import FlickrClient._
  
  def buscaFotos(tags: List[String]): Either[ClientError, Seq[Foto]] = {
    val url = s"$baseURL?method=flickr.photos.search&api_key=$apiKey&tags=${tags.mkString(",")}"
    
    val response = httpClient.get(url)
    
    response.fold(
      (error) => Left(ClientError(error.message)),
      (response) => responseParser.parse(response.body) match {
        case Right(parsed) => Right(parsed)
        case Left(error) => Left(ClientError(error.toString))
      })
  }
}

object FlickrClient {
  
  case class ClientError(message: String)
  
	def fromConfig(configuration: Config): FlickrClient = {
    val apiKey = configuration.getString("flickr.api.key")
    val baseURL = configuration.getString("flickr.api.baseurl")
    
    new FlickrClient(apiKey, baseURL, HttpClient.fromConfig(), new XMLFlickrResponseParser())
  }
}
