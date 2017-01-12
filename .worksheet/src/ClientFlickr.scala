
object ClientFlickr extends App {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 

  val apiKey = "39a23013cc824cb38fa55abc3ef80b9f";System.out.println("""apiKey  : String = """ + $show(apiKey ));$skip(38); 
  val method = "flickr.photos.search";System.out.println("""method  : String = """ + $show(method ));$skip(21); 
  val tags = "scala";System.out.println("""tags  : String = """ + $show(tags ));$skip(95); 
  val url = s"https://api.flickr.com/services/rest/?method=$method&api_key=$apiKey&tags=$tags";System.out.println("""url  : String = """ + $show(url ));$skip(62); 
  
  scala.io.Source.fromURL(url).getLines().foreach(println)}
}
