package introducao

object Closures {
  
  def main(args: Array[String]): Unit = {
    // Definindo a closure desde
    val desde = imprimirAte(20)
    
    println("Desde 17")
    
    println(desde(17))

    // Usando currying
    println("Desde 10")
    
    println(imprimirAte(20)(10))
  }
  
  // Funcao que retorna outra funcao
  def imprimirAte(fim: Int) = (comeco: Int) => for(i <- comeco to fim) yield i
  
}