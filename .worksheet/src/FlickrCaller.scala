
object FlickrCaller {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(123);  // (api: String) {
  
 // def this() = this("")
  
  val apiKey = "39a23013cc824cb38fa55abc3ef80b9f";System.out.println("""apiKey  : String = """ + $show(apiKey ));$skip(38); 
  
	def buscaFotos(tag: String) = ???;System.out.println("""buscaFotos: (tag: String)Nothing""");$skip(51); 
	
	val usuarioOpt: Option[String] = Option("User");System.out.println("""usuarioOpt  : Option[String] = """ + $show(usuarioOpt ));$skip(112); 
	
	def usuarioAtual = usuarioOpt match {
		case Some(user) => user
		case None => "anon"
		case _ => "aaaaa"
	};System.out.println("""usuarioAtual: => String""");$skip(24); 
	
	val a = usuarioAtual;System.out.println("""a  : String = """ + $show(a ))}
	
}
 
object Cap3  extends App  {
	 // val caller = FlickrCaller
	 // println(FlickrCaller.apiKey)
}
