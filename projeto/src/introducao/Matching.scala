package introducao

object Matching {

  def main(args: Array[String]) {
    val x = "2"
    val item = getItem(x)
    println(item.getClass)
  }

  // Fun‹o
  def getItem(obj: Any): Int = obj match {
  	case i: Int => i
  	case s: String => Integer.parseInt(s)
  	case (x, y) => getItem(x) + getItem(y)
  }
  
  // Procedimento
  def printItem(obj: Any) {
    println(obj match {
      case i: Int => i
      case s: String => Integer.parseInt(s)
      case (x, y) => getItem(x) + getItem(y)
    })
  }
}