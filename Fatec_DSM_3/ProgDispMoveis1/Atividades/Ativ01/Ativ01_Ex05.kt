fun main(){
    var fah: Double = 0.0
    var celsius: Double = 0.0

    print("Graus Fahrenheit: ")
    fah = readLine().toString().toDouble()

    celsius = (fah - 32) * 5/9
    print("Graus Celsius: $celsius")
}