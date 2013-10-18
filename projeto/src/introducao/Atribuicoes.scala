package introducao

// Singleton
object Atribuicoes {

  def main(args: Array[String]) {

    // Atribuição de valor (constante)
    val a: Int = 1
    
    // Atribuição com inferência de tipo
    val b = 1
    
    // Atribuição de variável
    var c = 1
    
    // Alteração de variável
    c = 2
    
    // Dupla atribuição
    val (d, e) = (3, 4)
    
    // Atribuição do mesmo valor a duas constantes
    val f, g = 3
    
    // Atribuição de String
    val h: String = "CEULP/ULBRA"
    
    // Chamada de função
    println(somar(g, c))

    // Chamada de função com valor padrão
    println(somar(g))
    
    // Atribuição com condicional
    val i = if (e > 2) "maior" else "menor"
  }

  // Declaração de função - chaves opcionais para uma só linha
  def somar(x: Int, y: Int = 0) = x + y

}