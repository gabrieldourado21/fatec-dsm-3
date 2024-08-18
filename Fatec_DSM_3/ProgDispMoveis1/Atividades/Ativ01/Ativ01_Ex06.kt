fun main(){
    var volume: Double = 0.0
    val pi: Double = 3.14159
    var raio: Double = 0.0
    var altura: Double = 0.0

    print("Raio: ")
    raio = readLine().toString().toDouble()
    print("Altura: ")
    altura = readLine().toString().toDouble()

    volume = pi * (Math.pow(raio,2.0)) * altura
    println("Volume: $volume")
}