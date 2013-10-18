package introducao

object Recursividade {

  def main(args: Array[String]): Unit = {
    loop(1, 100000)
  }
  
  def loop(inicio: Int, fim: Int): Unit = {
    if (inicio < fim) loop(inicio + 1, fim)
    else println("fim")
  }

}