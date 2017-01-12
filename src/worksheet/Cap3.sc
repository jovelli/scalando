object Cap3 { // (api: String) {
  
 // def this() = this("")
  
  val apiKey = "39a23013cc824cb38fa55abc3ef80b9f" //> apiKey  : String = 39a23013cc824cb38fa55abc3ef80b9f
  
	def buscaFotos(tag: String) = ???         //> buscaFotos: (tag: String)Nothing
	
	val usuarioOpt: Option[String] = Option("User")
                                                  //> usuarioOpt  : Option[String] = Some(User)
	
	def usuarioAtual = usuarioOpt match {
		case Some(user) => user
		case None => "anon"
		case _ => "aaaaa"
	}                                         //> usuarioAtual: => String
	
	val a = usuarioAtual                      //> a  : String = User
	
	val flickr = new FlickrCaller("NovoFlickr")
                                                  //> flickr  : FlickrCaller = FlickrCaller@3d24753a
  println(flickr.novo)                            //> NovoFlickr
  println(flickr.expr)                            //> bbbb
  
  flickr.getValor(id=10)                          //> res0: String = AAA10
 
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