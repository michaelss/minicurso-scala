package introducao.patterns

abstract class Valor
case class Real(quantia: Double) extends Valor
case class Moeda(quantia: Double, simbolo: String) extends Valor

object CaseClasses1 {

  def main(args: Array[String]): Unit = {
    val dinheiro: Valor = Real(20)
    // Por que precisei declarar o tipo (Valor)?
    
    dinheiro match {
      case Real(r) => println("R$ " + r) 
      case Moeda(v, s) => println(s + "$ " + v)
      case _ => println("Moeda desconhecida")
    }
  }

}