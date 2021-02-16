import br.com.example.bytebank.modelo.Cliente
import br.com.example.bytebank.modelo.ContaCorrente
import br.com.example.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX

    numeroY++

    println("NúmeroX: $numeroX")
    println("NúmeroY: $numeroY")

    val joao = Cliente(nome = "João", cpf = "123.456.789-10", senha = 12345)
    val maria = Cliente(nome = "Maria", cpf = "987.654.321-78", senha = 44444)

    val contaJoao = ContaCorrente(titular = joao, 1002)
    var contaMaria = ContaPoupanca(titular = maria, 1003)

    println("br.com.example.bytebank.modelo.Conta titular joao: ${contaJoao.titular}")
    println("br.com.example.bytebank.modelo.Conta titular maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}
