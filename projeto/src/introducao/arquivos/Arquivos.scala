package introducao.arquivos

import scala.io.Source

object Arquivos {

  def main(args: Array[String]): Unit = {
    val arquivo1 = Source.fromFile("src/intro/patterns/arquivo.txt")
    val linhas = arquivo1.getLines.toArray
    
    println(linhas.map(x => 1).sum)
    // Exercício 1: O que a linha acima faz?
    
    // Exercício 2: Contar somente os tweets com #Scala
    // Exercício 3: Listar os autores das linhas com #Palmas (case insensitive)
    // Exercício 4: Imprimir todas as linhas de um arquivo online.
    // Dicas:
    // * usar o método fromURL do objeto Source
    // * url a usar: https://raw.github.com/michaelss/minicurso-scala/master/projeto/src/arquivo.txt
  }

}