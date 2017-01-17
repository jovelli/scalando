
/** Cap2
* Esse capítulo mostra como acessar o web service do Flickr, usando filtros para method e tags.
* Imprime os arquivos que foram retornadas pela chamada.
*
*/

object ClientFlickr extends App {

  val apiKey = "39a23013cc824cb38fa55abc3ef80b9f"
  val method = "flickr.photos.search"
  val tags = "scala"
  val url = s"https://api.flickr.com/services/rest/?method=$method&api_key=$apiKey&tags=$tags"
  
  //Pega as linhas que retornaram da chamada na API e imprime
  scala.io.Source.fromURL(url).getLines().foreach(println)
}