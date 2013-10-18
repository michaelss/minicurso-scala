package introducao

object Exercicio1 {

  def main(args: Array[String]): Unit = {
    val lista = List(1, 4, 7, 13, 20)
    
    val c = lista.count(p => p % 2 == 0)
    
    println(c)
  }
}