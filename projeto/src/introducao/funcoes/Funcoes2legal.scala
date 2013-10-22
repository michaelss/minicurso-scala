package introducao.funcoes

object Funcoes2legal {

  def main(args: Array[String]): Unit = {
    val lista = List(1, 2, 3, 4, 5, 6, 7)
    val listaPares = filtrarLista(ehPar, lista)

    listaPares.foreach( println )
  }
  
  def filtrarLista(f: (Int) => Boolean, lista: List[Int]): List[Int] = {
    var novaLista = List[Int]()
    for (i <- lista) {
      if (f(i)) {
        novaLista = novaLista :+ i
      }
    }
    novaLista
  }
  
  def ehPar(x: Int) = x % 2 == 0
  
  // Exerc’cio 1: filtrar os itens menores que 5
  // Exerc’cio 2: filtrar os itens ’mpares
  // Exercicio 3: reescrever a funcao filtrarLista usando for-yield
}