/** FlickrClient
* Object utilizado para carregar fotos do Flickr a partir de tags passadas
* 
*/
package com.jovelli.flickr.client

import com.typesafe.config.Config
import com.jovelli.flickr.model.Foto

class FlickrClient(apiKey: String, baseURL: String, httpClient: HttpClient, responseParser: ResponseParser) {
  
  import com.jovelli.flickr.client.FlickrClient._
  
  def buscaFotos(tags: List[String]): Either[ClientError, Seq[Foto]] = {
    val url = s"$baseURL?method=$searchMethod&api_key=$apiKey&tags=${tags.mkString(",")}"
    
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
  
  val searchMethod = "flickr.photos.search"
  
	val apiKey = "39a23013cc824cb38fa55abc3ef80b9f"
	val method = "flickr.photos.search"
	val tags = "scala"
	val url = s"https://api.flickr.com/services/rest/?method=$method&api_key=$apiKey&tags=$tags"

	scala.io.Source.fromURL(url).getLines().foreach(println)
	
	def fromConfig(c: Config): Any = ???
	
	def buscaFotos(tag: List[String]): Either[Any, Seq[Foto]] = ???
}
