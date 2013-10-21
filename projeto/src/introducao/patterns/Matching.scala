package introducao.patterns

object Matching {

  def main(args: Array[String]) {
    val x = "2"
    val item = getItem(x)
    println(item)
    println(item.getClass)
  }

  // Fun‹o
  def getItem(obj: Any): Int = obj match {
  	case i: Int => i
  	case s: String => Integer.parseInt(s)
  	case (x, y) => getItem(x) + getItem(y) // Se for uma tupla (ver Atribuicoes.scala)
  	case _ => 0 // Se n‹o for nenhum dos outros
  }  
}