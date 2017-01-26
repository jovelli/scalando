package worksheet

import com.jovelli.scalando.FotoCap7
import com.jovelli.scalando.VideoCap7
import com.jovelli.scalando.Media

object Cap8 {

  //Type Bounds
  //Set[T] eh invariante passar um Set[Foto] como argumento onde esta esperando Set[Media] Nao compila, por mais que Foto extenda Media
  //List[T] eh covariante passar um List[Foto] como argumento onde esta esperando List[Media] compila e funciona
  def printaSetMedias[T <: Media](medias: Set[T]) = medias.foreach(println)
                                                  //> printaSetMedias: [T <: com.jovelli.scalando.Media](medias: Set[T])Unit
  
  val setFotos: Set[FotoCap7] = Set(FotoCap7(1, "PrimeiraFoto"), FotoCap7(2, "SegundaFoto"))
                                                  //> setFotos  : Set[com.jovelli.scalando.FotoCap7] = Set(FotoCap7(1,PrimeiraFoto
                                                  //| ), FotoCap7(2,SegundaFoto))
  val setVideos: Set[VideoCap7] = Set(VideoCap7(1, "PrimeiroVideo"), VideoCap7(2, "SegundoVideo"), VideoCap7(3, "TerceiroVideo"))
                                                  //> setVideos  : Set[com.jovelli.scalando.VideoCap7] = Set(VideoCap7(1,PrimeiroV
                                                  //| ideo), VideoCap7(2,SegundoVideo), VideoCap7(3,TerceiroVideo))
                                                  
  printaSetMedias(setFotos)                       //> FotoCap7(1,PrimeiraFoto)
                                                  //| FotoCap7(2,SegundaFoto)
  printaSetMedias(setVideos)                      //> VideoCap7(1,PrimeiroVideo)
                                                  //| VideoCap7(2,SegundoVideo)
                                                  //| VideoCap7(3,TerceiroVideo)
                                                  
	//List eh covariante. List[Media] aceita List[Foto] e List[Video], ambos, video e foto extendem de Media,
	def printListMedias(medias: List[Media]) = medias.foreach(println)
                                                  //> printListMedias: (medias: List[com.jovelli.scalando.Media])Unit
	
	val lstFotos: List[FotoCap7] = List(FotoCap7(1, "PrimeiraFoto"), FotoCap7(2, "SegundaFoto"))
                                                  //> lstFotos  : List[com.jovelli.scalando.FotoCap7] = List(FotoCap7(1,PrimeiraF
                                                  //| oto), FotoCap7(2,SegundaFoto))
	val lstVideos: List[VideoCap7] = List(VideoCap7(1, "PrimeiroVideo"), VideoCap7(2, "SegundoVideo"), VideoCap7(3, "TerceiroVideo"))
                                                  //> lstVideos  : List[com.jovelli.scalando.VideoCap7] = List(VideoCap7(1,Primei
                                                  //| roVideo), VideoCap7(2,SegundoVideo), VideoCap7(3,TerceiroVideo))
	
	printListMedias(lstFotos)                 //> FotoCap7(1,PrimeiraFoto)
                                                  //| FotoCap7(2,SegundaFoto)
	printListMedias(lstVideos)                //> VideoCap7(1,PrimeiroVideo)
                                                  //| VideoCap7(2,SegundoVideo)
                                                  //| VideoCap7(3,TerceiroVideo)
}