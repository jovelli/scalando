/** Foto model
* Classe Foto para armazenar as fotos carregadas da chamada ao flickr
* 
*/

package com.jovelli.flickr.model

class Foto (val id: Long, val owner: String, val title: String, val farm: Int) {
  
  val serviceResponse = ""
  val fotos = parseResponse(serviceResponse)	
  
  // val countFotosFarm2 = fotos.count(foto => foto.farm == 2); 
  
  def parseResponse(serviceResponse: String) = ???
}

