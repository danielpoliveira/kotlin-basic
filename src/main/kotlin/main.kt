fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank\n")

    val contaDaniel = Conta(titular = "Daniel", numero = 1000)
    val contaFran = Conta(titular = "Fran", numero = 1001)

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

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiasEReferencia() {
    val numeroX = 10
    var numeroY = numeroX

    numeroY++

    println("NúmeroX: $numeroX")
    println("NúmeroY: $numeroY")

    val contaJoao = Conta("João", 1002)
    var contaMaria = Conta("Maria", 1003)

    println("Conta titular joao: ${contaJoao.titular}")
    println("Conta titular maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

fun testaLacos() {
    //    for (i in 5 downTo 1) {
//
//        if(i == 4) {
//            continue
//        }
//
//        val titular: String = "Daniel $i"
//        val numeroConta: Int = 7500 + i
//        var saldo: Double = i + 10.0
//
//        println("Titular: $titular")
//        println("Número da conta: $numeroConta")
//        println("Saldo disponível: $saldo")
//
//        println("Valor de i: $i")
//
//        println("=================")
//        testaCondicoes(saldo)
//    }

    var i: Int = 0
    while (i < 5) {
        val titular: String = "Daniel $i"
        val numeroConta: Int = 7500 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo disponível: $saldo")

        println("Valor de i: $i")

        println("=================")

        i++
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}