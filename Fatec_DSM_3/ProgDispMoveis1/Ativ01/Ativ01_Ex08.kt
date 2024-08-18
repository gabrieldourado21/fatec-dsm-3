fun main(){
    var area: Double = 0.0
    val pi: Double = 3.14159
    var raio: Double = 0.0

    print("Raio: ")
    raio = readLine().toString().toDouble()

    area = pi * (Math.pow(raio,2.0))
    println("Área da Circunferência: $area")
}