package worksheet

object Cap9 {
  val lista = List(1, 2, 3, 4, 5, 6)              //> lista  : List[Int] = List(1, 2, 3, 4, 5, 6)
  val mapa = Map(1 -> "First", 2 -> "Second", 3 -> "Third", 4 -> "Fourth", 5 -> "Fifth", 6 -> "Sixth")
                                                  //> mapa  : scala.collection.immutable.Map[Int,String] = Map(5 -> Fifth, 1 -> Fi
                                                  //| rst, 6 -> Sixth, 2 -> Second, 3 -> Third, 4 -> Fourth)
  //Percorrendo lista, depois mapa
 	lista foreach (
 		l => mapa.get(l).foreach(println)
 	)                                         //> First
                                                  //| Second
                                                  //| Third
                                                  //| Fourth
                                                  //| Fifth
                                                  //| Sixth

	//for comprehensions
	//for sem yield chama .foreach dos elementos
	for {
		l <- lista
		item <- mapa.get(l)
	} println(item)                           //> First
                                                  //| Second
                                                  //| Third
                                                  //| Fourth
                                                  //| Fifth
                                                  //| Sixth
                                                  
  //yield chama map, flatMap dos monads
  //O tipo que entra eh o tipo que sai, entrou um List e saiu um List
	for {
		l <- lista
		item <- mapa.get(l)
	} yield item                              //> res0: List[String] = List(First, Second, Third, Fourth, Fifth, Sixth)
 
}