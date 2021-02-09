fun testaCopiasEReferencias() {
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
