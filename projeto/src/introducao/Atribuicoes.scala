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
    
    // Atribui��o de tupla
    val z = (3, 4)
    
    // Atribui��o de String
    val h: String = "CEULP/ULBRA"
    
    // Chamada de fun��o
    println(somar(g, c))

    // Chamada de fun��o com valor padr�o
    println(somar(g))
    
    // Chamada de procedimento
    imprimir("Encoinfo 2013")
    
    // Atribui��o com condicional
    val i = if (e > 2) "maior" else "menor"
      
    // Lazy: usado s� quando for acessado
    lazy val j = imprimir("Chamou o procedimento imprimir")
    
    println("j ainda n�o foi acessado")
    
    // Descomente a linha abaixo e execute novamente
    // j
  }

  // Declara��o de fun��o - chaves opcionais para uma s� linha
  def somar(x: Int, y: Int = 0) = x + y
  
  // Declara��o de procedimento - n�o retorna valor, n�o precisa de "="
  def imprimir(s: String) { println(s) }

}