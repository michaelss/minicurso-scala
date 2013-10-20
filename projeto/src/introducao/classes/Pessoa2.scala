package introducao.classes

import java.util.Date

class Pessoa2(val nome: String, var endereco: Endereco) {
  
  val id = Pessoa2.proximoId
  
  // Primeira diferenca para Pessoa1: alterando os getters e setters
  private var idadePrivada = 0
  
  def idade = idadePrivada
  
  def idade_= (novaIdade: Int) {
    if (novaIdade > idadePrivada) idadePrivada = novaIdade
  }
  
  val ultimoAcesso = new Date()

  def aumentarIdade() {
    idade += 1
  }
  
  override def toString() = {
    s"id: $id \nnome: $nome \nidade: $idade" 
  }
}

object Pessoa2 {
  private var ultimoId = 0
  private def proximoId() = { ultimoId += 1; ultimoId }
  
  // Segunda diferença para Pessoa1: método apply()
  def apply(nome: String, endereco: Endereco) =
    new Pessoa2(nome, endereco)
}

class Endereco(var logradouro: String, var cidade: String)