
import java.io._

class Foto(val id: String, val owner: String) {}

object Cap1 {

	val f: Foto = new Foto("1", "me")         //> f  : Foto = Foto@694f9431
	 
	val arquivos = new File("C:\\Estudo\\Scala\\foto").listFiles
                                                  //> arquivos  : Array[java.io.File] = Array(C:\Estudo\Scala\foto\fdsa.jpeg, C:\E
                                                  //| studo\Scala\foto\fdsa.jpg, C:\Estudo\Scala\foto\fdsa.txt)
	val extensionImgs = List(".jpg", ".jpeg", ".gif")
                                                  //> extensionImgs  : List[String] = List(.jpg, .jpeg, .gif)

	// Ambas linhas abaixo sao iguais:
	// .exists(a => nomeFile.endsWith(a) )
	// .exists(nomeFile.endsWith(_))
	def isImage(nomeFile: String) = extensionImgs.exists(nomeFile.endsWith(_))
                                                  //> isImage: (nomeFile: String)Boolean
	
	arquivos.filter(a => isImage(a.getName)).foreach(a => println(a.getName))
                                                  //> fdsa.jpeg
                                                  //| fdsa.jpg
}