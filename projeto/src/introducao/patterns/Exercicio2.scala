package introducao.patterns

import scala.collection.JavaConversions.propertiesAsScalaMap
import scala.collection.mutable.ArrayBuffer

object Exercicio2 {
  
  def main(args: Array[String]) {
    
    val (x, y) = (1, "Palmas") // Familiar?
    
    val Array(primeiro, segundo, _*) = Array(10, 20, 30, 40, 50)
    
    println(primeiro + ", " + segundo)
    
    for ((chave, valor) <- System.getProperties())
      println(chave + " => " + valor)


      
    // Exerc’cio: exibir as propriedades alinhadas, tal como o exemplo abaixo.
    // Obs.: Ser‡ necess‡rio descobrir a chave de maior tamanho primeiro
      
    // file.encoding.pkg             => sun.io
    // java.specification.version    => 1.6
    // sun.management.compiler       => HotSpot 64-Bit Tiered Compilers
    // user.language                 => pt
    // java.specification.name       => Java Platform API Specification
  }
  
}