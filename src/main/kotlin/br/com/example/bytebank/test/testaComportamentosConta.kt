import br.com.example.bytebank.modelo.Cliente
import br.com.example.bytebank.modelo.ContaCorrente
import br.com.example.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val daniel = Cliente(nome = "Daniel", cpf = "123.456.789-10", senha = 12345)
    val fran = Cliente(nome = "Fran", cpf = "987.654.321-78", senha = 44444)

    val contaDaniel = ContaCorrente(titular = daniel, numero = 1000)
    val contaFran = ContaPoupanca(titular = fran, numero = 1001)

    contaDaniel.deposita(1600.0)
    contaFran.deposita(350.45)

    println(contaDaniel.titular)
    println(contaDaniel.numero)
    println(contaDaniel.saldo)

    println()

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println()
    println("Efetuando depósito de 50.0 na conta do Daniel")
    contaDaniel.deposita(50.0)
    println(contaDaniel.saldo)

    println()
    println("Efetuando depósito de 70.0 na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Daniel")
    contaDaniel.saca(1650.0)
    println(contaDaniel.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(125.0)
    println(contaFran.saldo)

    println("Sacando em excesso na conta do Daniel")
    contaDaniel.saca(15.95)
    println(contaDaniel.saldo)

    println("Sacando em excesso na conta da Fran")
    contaFran.saca(350.5)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Daniel")
    val checkTransferencia = contaFran.transfere(valor = 300.0, destino = contaDaniel)
    if (checkTransferencia) {
        println("Transferência concluída")
    } else {
        println("Falha na transferẽncia")
    }

    println(contaDaniel.saldo)
    println(contaFran.saldo)
}
