fun main(){
    var numeros = intArrayOf(0,0,0)
    var menorNum: Int = 0
    var maiorNum: Int = 0

    for((i, num) in numeros.withIndex()){
        print("${i+1}º Número: ")
        numeros[i] = readLine().toString().toInt()
    }

    menorNum = minOf(numeros[0], numeros[1], numeros[2])
    maiorNum = maxOf(numeros[0], numeros[1], numeros[2])

    print("Ordem Crescente: ")

    print("$menorNum ")

    for((i, num) in numeros.withIndex()){
       if(numeros[i] != menorNum && numeros[i] != maiorNum){
           print("${numeros[i]} ")
       }
    }

    println("$maiorNum")
}