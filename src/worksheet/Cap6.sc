package worksheet

object Cap6 {
  
  def imprimeFoto(f: String) = println(f)         //> imprimeFoto: (f: String)Unit
  
	val fotos = Set("Primeira", "Segunda", "Terceira", "Quarta", "Quinta", "Sexta")
                                                  //> fotos  : scala.collection.immutable.Set[String] = Set(Quarta, Quinta, Sexta,
                                                  //|  Primeira, Terceira, Segunda)
  fotos.foreach(imprimeFoto);                     //> Quarta
                                                  //| Quinta
                                                  //| Sexta
                                                  //| Primeira
                                                  //| Terceira
                                                  //| Segunda
  
  val fotosSemPrimeira = fotos - new String("Primeira")
                                                  //> fotosSemPrimeira  : scala.collection.immutable.Set[String] = Set(Quarta, Qui
                                                  //| nta, Sexta, Terceira, Segunda)
  
  fotosSemPrimeira.foreach(imprimeFoto);          //> Quarta
                                                  //| Quinta
                                                  //| Sexta
                                                  //| Terceira
                                                  //| Segunda
                                                  
  val fotosList = new String("Primeiro") :: new String("Segundo") :: new String("Terceiro") :: new String("Quarto") :: Nil
                                                  //> fotosList  : List[String] = List(Primeiro, Segundo, Terceiro, Quarto)
  val fotosList2 = Nil.::(new String("Primeiro")).:+(new String("Segundo")).:+(new String("Terceiro")).::(new String("Quarto"))
                                                  //> fotosList2  : List[String] = List(Quarto, Primeiro, Segundo, Terceiro)
}