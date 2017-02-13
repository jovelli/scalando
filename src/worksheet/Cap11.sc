package worksheet

object Cap11 {
  val fotos = <fotos><foto>PrimeiraFoto</foto><foto>SegundaFoto</foto><foto>TerceiraFoto</foto><foto>QuartaFoto</foto>
		<foto>QuintaFoto</foto><foto>SextaFoto</foto></fotos>
                                                  //> fotos  : scala.xml.Elem = <fotos><foto>PrimeiraFoto</foto><foto>SegundaFoto<
                                                  //| /foto><foto>TerceiraFoto</foto><foto>QuartaFoto</foto>
                                                  //| 		<foto>QuintaFoto</foto><foto>SextaFoto</foto></fotos>

	(fotos \ "foto").map(_.text)              //> res0: scala.collection.immutable.Seq[String] = List(PrimeiraFoto, SegundaFot
                                                  //| o, TerceiraFoto, QuartaFoto, QuintaFoto, SextaFoto)
                                                  
	val a = Nil                               //> a  : scala.collection.immutable.Nil.type = List()
	val b = Some(a)                           //> b  : Some[scala.collection.immutable.Nil.type] = Some(List())
	
	b.get.isEmpty                             //> res1: Boolean = true
}