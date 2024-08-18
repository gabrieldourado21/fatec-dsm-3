fun main(){
    var num: Double = 0.0
    var numAoQuadrado: Double = 0.0

    print("Digite um Número: ")
    num = readLine().toString().toDouble()

    numAoQuadrado = Math.pow(num,2.0)
    println("$num ao quadrado é igual a $numAoQuadrado")
}