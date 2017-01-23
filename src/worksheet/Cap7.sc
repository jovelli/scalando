package worksheet

object Cap7 {
  
  //Uso de diferentes funcoes sobre lista de numeros
	val lista = List(0, 1, 2, 3, 4, 5)        //> lista  : List[Int] = List(0, 1, 2, 3, 4, 5)
	
	lista.foreach(println(_))                 //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
  
  lista.filter(_ % 2 == 0)                        //> res0: List[Int] = List(0, 2, 4)
  
  lista.sortWith((x, y) => x > y)                 //> res1: List[Int] = List(5, 4, 3, 2, 1, 0)
  
  lista.find(_ == 3).getOrElse(Option(4))         //> res2: Any = 3
                                                    
	lista.map("<li>" + _ + "</li>").foreach(println)
                                                  //> <li>0</li>
                                                  //| <li>1</li>
                                                  //| <li>2</li>
                                                  //| <li>3</li>
                                                  //| <li>4</li>
                                                  //| <li>5</li>

	//Reduce e fold
	//Reduce posso trabalhar com numericos, fold com os outros tipos
	val numeros = List(1, 2, 3, 4, 5)         //> numeros  : List[Int] = List(1, 2, 3, 4, 5)
  val soma = numeros.reduceLeft((acc, numero) => acc + numero)
                                                  //> soma  : Int = 15
                                                  
  
}