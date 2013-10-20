package introducao.traits

object Principal {

  def main(args: Array[String]): Unit = {

    val p1 = new Pessoa("Michael", new Endereco("Rua 1, n. 1", "Palmas"))
    p1.matricula = 345
    p1.renda = 1234.0
    p1.aprovarFerias(123)
    
    val p2 = new Pessoa("Ana", new Endereco("Rua 1, n. 1", "Palmas")) with Motorista
    p2.cnh = "09876-8"

    // Exercício: na trait Motorista, adicionar uma variável 'validade', do tipo Date
    // e um método 'podeDirigir', que retorna true ou false, conforme a validade. 
  }

}