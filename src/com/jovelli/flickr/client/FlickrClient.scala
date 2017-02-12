/** FlickrClient
* Object utilizado para carregar fotos do Flickr a partir de tags passadas
* 
*/
package com.jovelli.flickr.client

object FlickrClient extends App {
	val apiKey = "39a23013cc824cb38fa55abc3ef80b9f"
	val method = "flickr.photos.search"
	val tags = "scala"
	val url = s"https://api.flickr.com/services/rest/?method=$method&api_key=$apiKey&tags=$tags"

	scala.io.Source.fromURL(url).getLines().foreach(println)	
}
