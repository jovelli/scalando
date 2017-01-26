package worksheet

import com.jovelli.scalando.FotoCap7
import com.jovelli.scalando.VideoCap7
import com.jovelli.scalando.Media

object Cap8 {

  //Type Bounds
  def pegaMedias[T <: Media](medias: Set[T]) = medias.foreach(println)
                                                  //> pegaMedias: [T <: com.jovelli.scalando.Media](medias: Set[T])Unit
  
  val fotos: Set[FotoCap7] = Set(FotoCap7(1, "PrimeiraFoto"), FotoCap7(2, "SegundaFoto"))
                                                  //> fotos  : Set[com.jovelli.scalando.FotoCap7] = Set(FotoCap7(1,PrimeiraFoto), 
                                                  //| FotoCap7(2,SegundaFoto))
  
  pegaMedias(fotos)                               //> FotoCap7(1,PrimeiraFoto)
                                                  //| FotoCap7(2,SegundaFoto)
  
  val videos: Set[VideoCap7] = Set(VideoCap7(1, "PrimeiroVideo"), VideoCap7(2, "SegundoVideo"), VideoCap7(3, "TerceiroVideo"))
                                                  //> videos  : Set[com.jovelli.scalando.VideoCap7] = Set(VideoCap7(1,PrimeiroVide
                                                  //| o), VideoCap7(2,SegundoVideo), VideoCap7(3,TerceiroVideo))
  pegaMedias(videos)                              //> VideoCap7(1,PrimeiroVideo)
                                                  //| VideoCap7(2,SegundoVideo)
                                                  //| VideoCap7(3,TerceiroVideo)
}