package introducao

// Singleton
object Atribuicoes {

  def main(args: Array[String]) {

    // Atribui��o de valor (constante)
    val a: Int = 1
    
    // Atribui��o com infer�ncia de tipo
    val b = 1
    
    // Atribui��o de vari�vel
    var c = 1
    
    // Altera��o de vari�vel
    c = 2
    
    // Dupla atribui��o
    val (d, e) = (3, 4)
    
    // Atribui��o do mesmo valor a duas constantes
    val f, g = 3
    
    // Atribui��o de String
    val h: String = "CEULP/ULBRA"
    
    // Chamada de fun��o
    println(somar(g, c))

    // Chamada de fun��o com valor padr�o
    println(somar(g))
    
    // Atribui��o com condicional
    val i = if (e > 2) "maior" else "menor"
  }

  // Declara��o de fun��o - chaves opcionais para uma s� linha
  def somar(x: Int, y: Int = 0) = x + y

}