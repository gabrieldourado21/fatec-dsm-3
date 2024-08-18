fun main(){
    var valorA: Int = 0
    var valorB: Int = 0
    var aux: Int = 0

    print("Valor de A: ")
    valorA = readLine().toString().toInt()
    print("Valor de B: ")
    valorB = readLine().toString().toInt()

    aux = valorA
    valorA = valorB
    valorB = aux

    println("A virou B e B virou A")
    println("A: $valorA\nB: $valorB")
}