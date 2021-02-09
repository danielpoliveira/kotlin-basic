fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Daniel",
        cpf = "123.456.789-10",
        salario = 1000.00,
        senha = 1234
    )

    val diretora = Diretor(
        nome = "Fran",
        cpf = "987.654.321-00",
        salario = 2000.00,
        senha = 9876,
        plr = 200.00
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(gerente, 1234)
    sistemaInterno.entra(diretora, 9876)
}