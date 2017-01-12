object Cap3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(114);  // (api: String) {
  
 // def this() = this("")
  
  val apiKey = "39a23013cc824cb38fa55abc3ef80b9f";System.out.println("""apiKey  : String = """ + $show(apiKey ));$skip(38); 
  
	def buscaFotos(tag: String) = ???;System.out.println("""buscaFotos: (tag: String)Nothing""");$skip(51); 
	
	val usuarioOpt: Option[String] = Option("User");System.out.println("""usuarioOpt  : Option[String] = """ + $show(usuarioOpt ));$skip(112); 
	
	def usuarioAtual = usuarioOpt match {
		case Some(user) => user
		case None => "anon"
		case _ => "aaaaa"
	};System.out.println("""usuarioAtual: => String""");$skip(24); 
	
	val a = usuarioAtual;System.out.println("""a  : String = """ + $show(a ));$skip(47); 
	
	val flickr = new FlickrCaller("NovoFlickr");System.out.println("""flickr  : FlickrCaller = """ + $show(flickr ));$skip(23); 
  println(flickr.novo);$skip(23); 
  println(flickr.expr);$skip(28); val res$0 = 
  
  flickr.getValor(id=10);System.out.println("""res0: String = """ + $show(res$0));$skip(21); 
 
 	print(FotosCap3)}
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
