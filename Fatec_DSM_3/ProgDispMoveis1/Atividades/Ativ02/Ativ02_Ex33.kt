fun main(){
    var soma: Int = 0

    println("Soma dos 100 Primeiros Números")

    for(i in 1..100){
        soma += i
    }

    println("Resultado: $soma")
}