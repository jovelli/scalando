case class Foto(id: Long, owner: String, server: String, title: String)

object Cap11 {

  val items = List("PrimeiroItem", "SegundoItem", "TerceiroItem")
                                                  //> items  : List[String] = List(PrimeiroItem, SegundoItem, TerceiroItem)
  
  val xml = items.map(v => <li>{v}</li>).mkString //> xml  : String = <li>PrimeiroItem</li><li>SegundoItem</li><li>TerceiroItem</l
                                                  //| i>
                                                   
  val fotos = <fotos><foto>UmaFoto</foto><foto>OutraFoto</foto></fotos>
                                                  //> fotos  : scala.xml.Elem = <fotos><foto>UmaFoto</foto><foto>OutraFoto</foto><
                                                  //| /fotos>
  
  val nodeSeqFotos = (fotos \ "foto").map(_.text) //> nodeSeqFotos  : scala.collection.immutable.Seq[String] = List(UmaFoto, Outra
                                                  //| Foto)
}