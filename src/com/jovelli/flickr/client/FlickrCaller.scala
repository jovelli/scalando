/** FlickrCaller
* Class utilizada para carregar fotos do Flickr a partir de tags passadas
* 
*/
package com.jovelli.flickr.client

class FlickrCaller(val api: String) {
	def this() = this("")
	
	def buscaFotos(tag: String = "", userId: String = "") = ???
	
	buscaFotos(userId="fdsa")
}