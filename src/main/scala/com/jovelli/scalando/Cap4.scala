/** Cap4
* Objeto Media para uso nos execicios do worksheet de Cap4
* Uso de apply(), unapply() - construtor, extrator
* 
*/

package com.jovelli.scalando

class Media(val value: String) 

object Media {
	def apply(value: String) = new Media(value)
	def unapply(media: Media): Option[(String)] = Some(media.value)
}
