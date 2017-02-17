
/** Cap1
* Esse capítulo explica o uso de filter com exemplo para listar arquivos de um diretório.
* Arquivos sao filtrados de acordo com extensoes declaradas no List.
*
*/

import java.io._

class FotoCap1(val id: String, val owner: String) {}
	
object Cap1 {

	//Lista arquivos de um diretorio, filtra se os arquivos que sao imagens pelas extensoes de imagem e imprime.
	//Exemplos de acesso a diretorio, uso de filter

	val f: FotoCap1 = new FotoCap1("1", "me")
	 
	val arquivos = new File("C:\\Estudo\\Scala\\foto").listFiles
	val extensionImgs = List(".jpg", ".jpeg", ".gif")

	// Ambas linhas abaixo sao iguais:
	// .exists(a => nomeFile.endsWith(a) )
	// .exists(nomeFile.endsWith(_))
	def isImage(nomeFile: String) = extensionImgs.exists(nomeFile.endsWith(_))
	
	arquivos.filter(a => isImage(a.getName)).foreach(a => println(a.getName))
}