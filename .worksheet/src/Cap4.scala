

object Cap4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(33); 
  println("fdsa");$skip(32); 
  
  val fotos = Media("fotos");System.out.println("""fotos  : Media = """ + $show(fotos ));$skip(31); 
  val videos = Media("videos");System.out.println("""videos  : Media = """ + $show(videos ));$skip(25); 
  val all = Media("all");System.out.println("""all  : Media = """ + $show(all ));$skip(24); 
  
  println(FotosCap4);$skip(33); 
  
  val media: Any = VideosCap4;System.out.println("""media  : Any = """ + $show(media ));$skip(174); 
  
  val texto = media match {
  	case FotosCap4 => "Processando fotos"
  	case VideosCap4 => "Processando videos"
  	case AllCap4 => "Processando todos"
  	case _ => -1
  };System.out.println("""texto  : Any = """ + $show(texto ))}
  
}

case object FotosCap4 extends Media("fotos")
case object VideosCap4 extends Media("videos")
case object AllCap4 extends Media("all")
