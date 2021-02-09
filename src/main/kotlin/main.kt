fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank\n")

    val daniel = Funcionario(
        nome = "Daniel",
        cpf = "123.456.789-10",
        salario = 15648.45,
        tipo = 0
    )

    println("Nome: ${daniel.nome}")
    println("CPF: ${daniel.cpf}")
    println("Salário: ${daniel.salario}")
    println("Bonificação: ${daniel.bonificacao()}")
}