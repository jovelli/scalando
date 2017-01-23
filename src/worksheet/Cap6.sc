
/** Cap6
* Esse capitulo explica o uso de Colecoes como Set, List, Tuplas.
* Explica o uso de Option - Some - None
*
*/

package worksheet

object Cap6 {
  
  def imprimeFoto(f: String) = println(f)         //> imprimeFoto: (f: String)Unit
  
  //Set: uso de set, remover item de set
	val fotos = Set("Primeira", "Segunda", "Terceira", "Quarta", "Quinta", "Sexta")
                                                  //> fotos  : scala.collection.immutable.Set[String] = Set(Quarta, Quinta, Sexta,
                                                  //|  Primeira, Terceira, Segunda)
  fotos.foreach(imprimeFoto)                      //> Quarta
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

  //List: maneiras de se criar Lists
  val fotosList = new String("Primeiro") :: new String("Segundo") :: new String("Terceiro") :: new String("Quarto") :: Nil
                                                  //> fotosList  : List[String] = List(Primeiro, Segundo, Terceiro, Quarto)
  val fotosList2 = Nil.::(new String("Primeiro")).:+(new String("Segundo")).:+(new String("Terceiro")).::(new String("Quarto"))
                                                  //> fotosList2  : List[String] = List(Quarto, Primeiro, Segundo, Terceiro)
                                       
  // var abc = (null.asInstanceOf[String]).trim()
                                                 
  var abc = Option(null.asInstanceOf[String])// Option(null)
                                                  //> abc  : Option[String] = None
	println(abc)                              //> None

	abc match {
		case Some(a) => println("Some")
		case None => println("None")
	}                                         //> None
		
		
	//Tuplas: definidas dentro dos parenteses ()
	val tupla = ("1", "reuniao dos escaladores")
                                                  //> tupla  : (String, String) = (1,reuniao dos escaladores)
	println(s"id: ${tupla._1} descricao: ${tupla._2}")
                                                  //> id: 1 descricao: reuniao dos escaladores
	 	
	 	
	//Maps: maneiras de se criar Maps
	val map = Map( (1 -> "PrimeiroValor"), (2 -> "SegundoValor") )
                                                  //> map  : scala.collection.immutable.Map[Int,String] = Map(1 -> PrimeiroValor,
                                                  //|  2 -> SegundoValor)
  map + (3 -> "TerceiroValor")                    //> res0: scala.collection.immutable.Map[Int,String] = Map(1 -> PrimeiroValor, 
                                                  //| 2 -> SegundoValor, 3 -> TerceiroValor)
  map updated (3, "NovoTerceirovalor")            //> res1: scala.collection.immutable.Map[Int,String] = Map(1 -> PrimeiroValor, 
                                                  //| 2 -> SegundoValor, 3 -> NovoTerceirovalor)
                                                      
  val pegaValMap = map.getOrElse(1, "NaoExiste")  //> pegaValMap  : String = PrimeiroValor
  
  
  //Arrays
  val array = Array(1, 2, 3, 4)                   //> array  : Array[Int] = Array(1, 2, 3, 4)
  array(1)                                        //> res2: Int = 2
  
  
  //Expressao regular para obfuscar email com ***
  val test = "meuemail@gmail.com".replaceAll("(^.{1,3})(.*)(@.*)", "$1***$3")
                                                  //> test  : String = meu***@gmail.com
  
  
}