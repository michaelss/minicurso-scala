package introducao.traits

import java.util.Date

class Pessoa(val nome: String, var endereco: Endereco) extends Funcionario with Gerente {

  val id = Pessoa.proximoId

  var idade = 0

  val ultimoAcesso = new Date()

  def aumentarIdade() {
    idade += 1
  }

  override def toString() = {
    s"id: $id \nnome: $nome \nidade: $idade"
  }
}

object Pessoa {
  private var ultimoId = 0
  private def proximoId() = { ultimoId += 1; ultimoId }
}

class Endereco(var logradouro: String, var cidade: String)