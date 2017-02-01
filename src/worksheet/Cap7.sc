package worksheet

import com.jovelli.scalando.Media

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
                                    	
  val xmlLi: scala.xml.Elem = <li>valorDentroLi</li>
                                                  //> xmlLi  : scala.xml.Elem = <li>valorDentroLi</li>
                                    	                
	lista.map(valor => <li>{valor}</li>).foreach(println)
                                                  //> <li>0</li>
                                                  //| <li>1</li>
                                                  //| <li>2</li>
                                                  //| <li>3</li>
                                                  //| <li>4</li>
                                                  //| <li>5</li>

	//Reduce e fold
	//reduceLeft para comecar pega os dois primeiros itens da lista
	//foldLeft para comecar pega o item passado como argumento e o primeiro item da lista
	val numeros = List[Int](1, 2, 3, 4, 5)    //> numeros  : List[Int] = List(1, 2, 3, 4, 5)
  val soma = numeros.reduceLeft((acc, numero) => acc + numero)
                                                  //> soma  : Int = 15
                                                  
  val numerosStr = List[String]("1", "2", "3", "4", "5")
                                                  //> numerosStr  : List[String] = List(1, 2, 3, 4, 5)
  
  numerosStr.reduceLeft((a, b) => a + b)          //> res3: String = 12345
                                                  
  val listaStr = List[String]("A", "B", "C", "D", "E")
                                                  //> listaStr  : List[String] = List(A, B, C, D, E)
  
  listaStr.foldLeft("")((s1, s2) => s1 + s2)      //> res4: String = ABCDE
  
}