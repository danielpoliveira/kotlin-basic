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
