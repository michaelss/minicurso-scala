package introducao.classes

object Principal {

  def main(args: Array[String]): Unit = {
    
    val p1 = new Pessoa("Michael", new Endereco("Rua 1, n. 1", "Palmas"))
    println(s"*1* Depois de instanciado: \n$p1")

    // Onde est� a defini��o da classe Endereco?
    
    val p2 = new Pessoa("Ana", new Endereco("Rua 1, n. 1", "Palmas"))
    println(s"\n*2* Depois de instanciada: \n$p2")

    p1.idade = 30
    println(s"\n*3* Depois da idade alterada: \n$p1")
    
    // Por que a linha abaixo gera erro?
    //pessoa.nome = "Schuenck" 

    // Exerc�cio 1: Trocar Pessoa por Pessoa2
    // Exerc�cio 2: Retirar "new" da instancia��o de Pessoa
    // Exerc�cio 3: Trocar a idade de pessoa para 27
  }
}