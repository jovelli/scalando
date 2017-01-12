
class Media(value: String)

case object FotosCap4 extends Media;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); ("fotos");System.out.println("""<init> : ()FotosCap4.type""")}
case object VideosCap4 extends Media("videos")
case object AllCap4 extends Media("all")

object Cap4 {
  println("fdsa")
  
  val fotos = Media("fotos")
  val videos = Media("videos")
  val all = Media("all")
  
  println(FotosCap4)
}
