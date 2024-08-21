fun main(){
    var celsius: Double = 0.0
    var fah: Double = 0.0

    for(i in 10..100 step 10){
        celsius += 10
        fah = celsius * 1.8 + 32

        println("Celsius: $celsius - Fahrenheit: $fah")
    }
}