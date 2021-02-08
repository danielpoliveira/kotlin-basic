fun main(args: Array<String>) {
//    println("Bem vindo ao ByteBank")
//    println()
//
//    val contaDaniel = Conta();
//    val contaFran = Conta()
//
//    contaDaniel.titular = "Daniel"
//    contaDaniel.numero = 7500
//    contaDaniel.saldo = 1600.0
//
//    contaFran.titular = "Fran"
//    contaFran.numero = 9751
//    contaFran.saldo = 350.45
//
//    println(contaDaniel.titular)
//    println(contaDaniel.numero)
//    println(contaDaniel.saldo)
//
//    println()
//
//    println(contaFran.titular)
//    println(contaFran.numero)
//    println(contaFran.saldo)

    val numeroX = 10
    var numeroY = numeroX

    numeroY++

    println("NúmeroX: $numeroX")
    println("NúmeroY: $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"

    var contaMaria = Conta()
    contaMaria.titular = "Maria"

    println("Conta titular joao: ${contaJoao.titular}")
    println("Conta titular maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
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