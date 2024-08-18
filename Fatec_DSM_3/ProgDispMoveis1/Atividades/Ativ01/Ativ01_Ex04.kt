fun main(){
    var celsius: Double = 0.0
    var fah: Double = 0.0

    print("Graus Celsius: ")
    celsius = readLine().toString().toDouble()

    fah = (9 * celsius + 160) / 5
    println("Graus Fahrenheit: $fah")
}