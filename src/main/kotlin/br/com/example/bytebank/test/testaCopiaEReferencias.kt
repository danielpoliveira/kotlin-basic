import br.com.example.bytebank.modelo.ContaCorrente
import br.com.example.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX

    numeroY++

    println("NúmeroX: $numeroX")
    println("NúmeroY: $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    var contaMaria = ContaPoupanca("Maria", 1003)

    println("br.com.example.bytebank.modelo.Conta titular joao: ${contaJoao.titular}")
    println("br.com.example.bytebank.modelo.Conta titular maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}
