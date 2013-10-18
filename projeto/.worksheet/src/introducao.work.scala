package introducao

object work {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet");$skip(20); 
  val x = "Michael";System.out.println("""x  : String = """ + $show(x ));$skip(34); 
  
  for (i <- 1 to 4) println(i);$skip(41); val res$0 = 
               
	Atribuicoes.somar(3, 4);System.out.println("""res0: Int = """ + $show(res$0))}
}
