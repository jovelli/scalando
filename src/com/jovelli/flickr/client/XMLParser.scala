/** XMLParser
* Parser de String para XML ao tratar resposta do Flickr
* 
*/
package com.jovelli.flickr.client

object XMLParser {
	import scala.xml.XML
	
	def parse(str: String): Seq[Foto] = {
		val xmlResp = XML.loadString(str)
		
		xmlResp \\ "photo" map  { p =>
			Foto(	(p \ "@id" text).toLong,
						(p \ "@owner" text),
						(p \ "@server" text),
						(p \ "title" text)
			)}
	}
}
