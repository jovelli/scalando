
/** Cap3
* Esse capítulo explica o uso de Option, match pattern.
* Uso de classes abstratas e herança.
*
*/

object Cap3 {
	
  val apiKey = "39a23013cc824cb38fa55abc3ef80b9f"
  
	def buscaFotos(tag: String) = ???
	
	val usuarioOpt: Option[String] = Option("User")
	
	def usuarioAtual = usuarioOpt match {
		case Some(user) => user
		case None => "anon"
		case _ => "aaaaa"
	}
	
	val a = usuarioAtual
	
	val flickr = new FlickrCaller("NovoFlickr")
  println(flickr.novo)
  println(flickr.expr)
  
  flickr.getValor(id=10)
 
 	print(FotosCap3)
}
 
class FlickrCaller(val novo: String) {
	 def this() = this("")
	
	 val expr = "bbbb"
	 
	 def getValor(valor: String = "AAA", id: Int) = valor + id
}
	 
abstract class MediaCap3(val value: String = "")

object FotosCap3 extends MediaCap3("fotos")
object VideosCap3 extends MediaCap3("videos")
object AllCap3 extends MediaCap3("all")