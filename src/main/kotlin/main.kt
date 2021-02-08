fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank")

    val titular: String = "Daniel"
    val numeroConta: Int = 7500
    var saldo: Double = -20.0

//    saldo = 100 + 2.0
//    saldo += 200

    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo disponível: $saldo")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }

}