package introducao.patterns

import scala.collection.JavaConversions.propertiesAsScalaMap

object Exemplos {
  
  def main(args: Array[String]) {
    
    val (x, y) = (1, "Palmas") // Familiar?
    
    val Array(primeiro, segundo, _*) = Array(10, 20, 30, 40, 50)
    
    println(primeiro + ", " + segundo)
    
    for ((chave, valor) <- System.getProperties())
      println(chave + " => " + valor)
  }
  
}