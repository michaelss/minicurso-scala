package introducao

import java.awt.print.Printable

object Principal {
  
  def main(args: Array[String]) {
    // Declaração de uma lista
    val lista = List("Apple", "Google", "Linux", "Microsoft")
    
    // Acessando o primeiro item
    println(lista(0))
    
    // Imprimindo todos os itens
    for (item <- lista) println(item)
    
    // Imprimindo todos os itens
    lista.foreach( item => println(item) )
    
    // Imprimindo todos os itens - mais simples
    lista.foreach( println(_) )
    
    // Imprimindo todos os itens - mais simples ainda
    lista.foreach( println )

    // Colocando os itens que contêm "l" no plural e guardando-os
    val comL = for (item <- lista if item.contains("l")) yield item + "s"
    
    // Imprimindo os itens que conêm "l"
    println(comL mkString(", "))
    
    // Imprimindo os itens de 1 a 4
    1.to(4).foreach( v => println(v) )
    
    // Imprimindo os itens de 1 a 4 - notação mais simplificada
    1 to 4 foreach( println )
  }

}