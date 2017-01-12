
class FlickrCaller(api: String) {
  
  def this() = this("")
  
  val apiKey = "39a23013cc824cb38fa55abc3ef80b9f"
  
	def buscaFotos(tag: String) = ???
	
	val usuarioOpt: Option[String] = Option("User")
	
	def usuarioAtual = usuarioOpt match {
		case Some(user) => user
		case None => "anon"
		case _ => "aaaaa"
	}
	
	val a = usuarioAtual
	
}
 
object Cap3a extends App {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(413); 
	val caller = new FlickrCaller("apikey");System.out.println("""caller  : FlickrCaller = """ + $show(caller ));$skip(24); 
	println(caller.apiKey)}
}
