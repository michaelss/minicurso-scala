package introducao.funcoes

object Funcoes3 {

  def main(args: Array[String]): Unit = {
    val listaInt = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Quantos ’mpares a lista possui
    println(listaInt.count(_ % 2 != 0))

    // Multiplicando os itens por 10
    println(listaInt.map(_ * 10))
    
    
    val listaNomes = List("Ana", "Daniel", "Daniela", "Eliana", "Marcio", "Marcia")
    
    // Nomes que terminam com "a"
    println(listaNomes.filter(_ endsWith "a")) // igual a _.endsWith("a")
    
    
    // Somando os inteiros
    listaInt.reduceLeft(_ + _)
  }

}