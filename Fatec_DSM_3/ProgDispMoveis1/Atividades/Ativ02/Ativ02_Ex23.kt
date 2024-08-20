fun main(){
    var numeros = intArrayOf(0,0,0,0,0)
    var maiorNum: Int = 0
    var menorNum: Int = 0

    for((i, num) in numeros.withIndex()){
        print("${i+1}º Número: ")
        numeros[i] = readLine().toString().toInt()
    }

    maiorNum = maxOf(numeros[0], numeros[1], numeros[2], numeros[3], numeros[4])
    println("Maior Número: $maiorNum")

    menorNum = minOf(numeros[0], numeros[1], numeros[2], numeros[3], numeros[4])
    println("Menor Número: $menorNum")
}