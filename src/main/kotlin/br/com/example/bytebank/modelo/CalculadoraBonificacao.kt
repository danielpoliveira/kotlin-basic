package br.com.example.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0

    fun registra(funcionario: Funcionario) {
        println("Nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

}