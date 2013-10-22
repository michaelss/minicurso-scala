package introducao.funcoes

object Funcoes2ruim {

  def main(args: Array[String]): Unit = {
    val lista = List(1, 2, 3, 4, 5, 6, 7)
    val listaPares = filtrarPares(lista)
    listaPares.foreach( item => println(item) )
  }
  
  def filtrarPares(lista: List[Int]): List[Int] = {
    var novaLista = List[Int]()
    for (i <- lista) {
      if (i % 2 == 0) {
        novaLista = novaLista :+ i
      }
    }
    novaLista
  }
  
  // Exerc’cio 1: filtrar os itens menores que 5
  // Exerc’cio 2: filtrar os itens ’mpares
  
}