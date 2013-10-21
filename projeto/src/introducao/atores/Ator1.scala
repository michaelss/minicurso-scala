package introducao.atores

import scala.actors.Actor._
import introducao.patterns.Real

object Ator1 {

  def main(args: Array[String]): Unit = {
    
    val ator = actor {
      println("Iniciando ator...")
      while (true) {
        receive {
          case "Oi" => Thread.sleep(2000); println("Ol‡")
          case Real(v) => println("Recebi R$ " + v)
        }
      }
    }
    
    ator ! "Oi"
    
    println("Chamou o ator...")
    // A linha acima foi executada antes do "Ol‡" 
    
    ator ! Real(35)
  }

}