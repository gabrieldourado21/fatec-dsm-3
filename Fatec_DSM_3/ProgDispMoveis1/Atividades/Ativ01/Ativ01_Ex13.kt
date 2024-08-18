fun main(){
    var num: Int = 0
    var resto: Int = 0

    print("Digite um Número: ")
    num = readLine().toString().toInt()

    println("$num / 6 = ${num / 6}")
    resto = num % 6
    println("Resto: $resto")
}