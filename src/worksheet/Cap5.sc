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