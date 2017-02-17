
/** Cap5
* Esse capitulo explica o uso de try catch com match pattern para catch.
* Explica o uso de algumas definicoes de Predef como ???
*
*/

package worksheet

import java.io.IOException
import scala.util.control.NonFatal

object Cap5 {
  def method = ???                                //> method: => Nothing
  
  try {
  	method
  } catch {
  	case e: IOException => println("Pegou uma IOException")
  	case e: Exception => println("Pegou uma Exception")
  	case NonFatal(e) => println("Catch Error tratavel " + e.getCause)
  	case _ => println("catch _ final")
  }                                               //> Catch Error tratavel null
  
}