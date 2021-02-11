import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX

    numeroY++

    println("NúmeroX: $numeroX")
    println("NúmeroY: $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    var contaMaria = ContaPoupanca("Maria", 1003)

    println("modelo.Conta titular joao: ${contaJoao.titular}")
    println("modelo.Conta titular maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}
