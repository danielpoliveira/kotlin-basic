import br.com.example.bytebank.modelo.Cliente
import br.com.example.bytebank.modelo.ContaCorrente
import br.com.example.bytebank.modelo.ContaPoupanca
import br.com.example.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val daniel = Cliente(
        nome = "Daniel",
        cpf = "123.456.789-10",
        senha = 12345,
        endereco = Endereco(
            logradouro = "Rua 123 Quadra 56",
            bairro = "Bairro qualquer",
            cidade = "Cidade sei lá",
            estado = "Ainda não sei",
            numero = 648,
            cep = "12354-987",
            complemento = "Esse é o complemento do endereço"
        )
    )

    val fran = Cliente(nome = "Fran", cpf = "987.654.321-78", senha = 44444)

    val contaCorrente = ContaCorrente(titular = daniel, numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = fran, numero = 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Titular ${contaCorrente.titular}")
    println("Nome do titular: ${contaCorrente.titular.nome}")
    println("CPF do titular: ${contaCorrente.titular.cpf}")
    println("Endereço do titular: ${contaCorrente.titular.endereco}")
    println("Logradouro do titular: ${contaCorrente.titular.endereco.logradouro}")
    println()

    println("Saldo da conta corrente: ${contaCorrente.saldo}")
    println("Saldo da conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println()
    println("Saldo da conta após saque - corrente: ${contaCorrente.saldo}")
    println("Saldo da conta após saque - poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println()
    println("Saldo da conta corrente após transferir para a conta poupança: ${contaCorrente.saldo}")
    println("Saldo da conta poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println()
    println("Saldo da conta poupança após transferir para a conta corrente: ${contaPoupanca.saldo}")
    println("Saldo da conta corrente após receber transferência: ${contaCorrente.saldo}")
}