

object Cap4 {
  println("fdsa")                                 //> fdsa
  
  val fotos = Media("fotos")                      //> fotos  : Media = Media@7f63425a
  val videos = Media("videos")                    //> videos  : Media = Media@36d64342
  val all = Media("all")                          //> all  : Media = Media@39ba5a14
  
  println(FotosCap4)                              //> FotosCap4
  
  val media: Any = VideosCap4                     //> media  : Any = VideosCap4
  
  val texto = media match {
  	case FotosCap4 => "Processando fotos"
  	case VideosCap4 => "Processando videos"
  	case AllCap4 => "Processando todos"
  	case _ => -1
  }                                               //> texto  : Any = Processando videos
  
}

case object FotosCap4 extends Media("fotos")
case object VideosCap4 extends Media("videos")
case object AllCap4 extends Media("all")