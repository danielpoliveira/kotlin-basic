fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank")

    val daniel = Funcionario(
        nome = "Daniel",
        cpf = "123.456.789-10",
        salario = 15648.45,
    )

    println()
    println("Nome: ${daniel.nome}")
    println("CPF: ${daniel.cpf}")
    println("Salário: ${daniel.salario}")
    println("Bonificação: ${daniel.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "234.567.890.11",
        salario = 36978.45,
        senha = 1234
    )

    println()
    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao}")

    if(fran.autentica(1234)) {
        println("Autenticou com sucesso :)")
    } else {
        println("Falha na autenticação :(")
    }

    val gui = Diretor(
        nome="Gui",
        cpf = "345.678.901.-12",
        salario = 98457.97,
        senha=9876,
        plr = 200.0
    )

    println()
    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao}")
    println("Partificação lucro: ${gui.plr}")

    if(gui.autentica(9876)) {
        println("Autenticou com sucesso :)")
    } else {
        println("Falha na autenticação :(")
    }
}