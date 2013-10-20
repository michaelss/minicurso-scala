package introducao.patterns

abstract class Item
case class Diretorio(nome: String, filhos: Array[Item]) extends Item
case class Arquivo(nome: String, tipo: String) extends Item

object CaseClasses2 {
  
  def main(args: Array[String]) {
    
    val raiz = montar
    
    percorrer(raiz)
    
    def percorrer(item: Item, nivel: Int = 1) {
      item match {
        case Diretorio(nome, itens) => println(s"${" " * nivel}Diret—rio $nome"); itens.foreach(percorrer(_, nivel + 1))
        case Arquivo(nome, tipo) => println(s"${" " * nivel}Arquivo $nome do tipo $tipo")
      }
    }
  }
  
  def montar() = {
    val apresentacao = Arquivo("scala", "pdf")
    val ficha = Arquivo("ficha", "odt")
    val form = Arquivo("form", "odt")
    
    val bin = Diretorio("bin/", Array(Arquivo("ls", "exec"),
    								  Arquivo("pwd", "exec")))
    val home = Diretorio("home/", Array(Diretorio("michael/", Array(apresentacao, ficha, form))))
    val tmp = Diretorio("tmp/", Array(Arquivo("lixo", "txt")))
    
    Diretorio("/", Array(bin, home, tmp))
  }
}