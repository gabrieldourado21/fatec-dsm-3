fun main(){
    mostrarMenu()
}

fun mostrarMenu(): Unit{
    var opcaoUsuario: Int = 0

    do{
        print("Opção: ")
        opcaoUsuario = readLine().toString().toInt()

        when(opcaoUsuario){
            1 -> calcularFatorial()
            2 -> calcularNumAoQuadrado()
            3 -> calcularVolume()
            4 -> sair()
            else -> tentarNovamente()
        }
    } while(opcaoUsuario != 4)
}

fun calcularFatorial(): Unit{
    var num: Int = 0
    var fatorial: Int = 1

    println("Fatorial de um Número")

    print("Número: ")
    num = readLine().toString().toInt()

    if(num == 0 || num == 1){
        println("$num! = 1")
    }
    else if(num == 2){
        println("$num! = 2")
    }
    else if(num >= 3){
        for(i in num downTo 1){
            fatorial *= i

            if(i == 2){
                break
            }
        }
        println("$num! = $fatorial")
    }
    else{
        println("Número inválido. Digite novamente.")
    }
}

fun calcularNumAoQuadrado(): Unit{
    var num: Double = 0.0
    var numAoQuadrado: Double = 0.0

    println("Quadrado de um Número")

    print("Número: ")
    num = readLine().toString().toDouble()

    numAoQuadrado = Math.pow(num,2.0)
    println("$num ao quadrado é igual a $numAoQuadrado")
}

fun calcularVolume(): Unit{
    var volume: Double = 0.0
    val pi: Double = 3.14159
    var raio: Double = 0.0
    var altura: Double = 0.0

    println("Volume de uma Lata")

    print("Raio: ")
    raio = readLine().toString().toDouble()
    print("Altura: ")
    altura = readLine().toString().toDouble()

    volume = pi * (Math.pow(raio,2.0)) * altura
    println("Volume: $volume")
}

fun sair(): Unit{
    println("Saindo...")
}

fun tentarNovamente(): Unit{
    println("Opção Inválida. Tente novamente.")
}