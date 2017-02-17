
/** Cap4
* Esse capítulo explica o uso de case objects.
* Mostra mais exemplos do funcionamento de match pattern.
*
*/

import com.jovelli.scalando.Media

object Cap4 {

  val fotos = Media("fotos")
  val videos = Media("videos")
  val all = Media("all")
   
  println(FotosCap4)
   
  val media: Any = VideosCap4
  
  val texto = media match {
  	case FotosCap4 => "Processando fotos"
  	case VideosCap4 => "Processando videos"
  	case AllCap4 => "Processando todos"
  	case _ => -1
  }
  
}

case object FotosCap4 extends Media("fotos")
case object VideosCap4 extends Media("videos")
case object AllCap4 extends Media("all")