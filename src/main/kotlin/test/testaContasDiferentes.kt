import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Daniel",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

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