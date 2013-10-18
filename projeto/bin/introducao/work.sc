package introducao

object work {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = "Michael"                               //> x  : String = Michael
  
  for (i <- 1 to 4) println(i)                    //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
               
	Atribuicoes.somar(3, 4)                   //> res0: Int = 7
}