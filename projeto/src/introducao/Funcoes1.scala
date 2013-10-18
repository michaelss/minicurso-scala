package introducao

object Funcoes1 {

  def main(args: Array[String]): Unit = {
    val soma = fazerAlgo(somar, 3, 4)
    println(soma)
    
    // Com fun‹o an™nima, tambŽm chamada fun‹o lambda
    val mult = fazerAlgo((x: Int, y: Int) => x * y, 3, 4)
    println(mult)
  }

  def fazerAlgo(f: (Int, Int) => Int, x: Int, y: Int): Int = f(x, y)
  
  def somar(a: Int, b: Int) = a + b
  
  // Exercicio: usar a funcao fazerAlgo para descobrir o maior valor
}