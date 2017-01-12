
import java.io._

class Foto(val id: String, val owner: String) {}

object Cap1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(118); 

	val f: Foto = new Foto("1", "me");System.out.println("""f  : Foto = """ + $show(f ));$skip(65); 
	 
	val arquivos = new File("C:\\Estudo\\Scala\\foto").listFiles;System.out.println("""arquivos  : Array[java.io.File] = """ + $show(arquivos ));$skip(51); 
	val extensionImgs = List(".jpg", ".jpeg", ".gif");System.out.println("""extensionImgs  : List[String] = """ + $show(extensionImgs ));$skip(187); 

	// Ambas linhas abaixo sao iguais:
	// .exists(a => nomeFile.endsWith(a) )
	// .exists(nomeFile.endsWith(_))
	def isImage(nomeFile: String) = extensionImgs.exists(nomeFile.endsWith(_));System.out.println("""isImage: (nomeFile: String)Boolean""");$skip(77); 
	
	arquivos.filter(a => isImage(a.getName)).foreach(a => println(a.getName))}
}
