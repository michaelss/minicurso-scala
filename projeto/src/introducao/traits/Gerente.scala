package introducao.traits

trait Gerente {
	def aprovarFerias(matricula: Int) {
		println(s"F�rias do funcionario $matricula aprovada.")
	}
}