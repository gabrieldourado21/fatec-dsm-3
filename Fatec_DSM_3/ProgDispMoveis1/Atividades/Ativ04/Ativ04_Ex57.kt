fun main(){
    var vetorA = intArrayOf(0, 0, 0, 0, 0)
    var vetorB = intArrayOf(0, 0, 0, 0, 0)
    var fatorial: Int = 1

    println("Vetor A")

    for(i in 0..4){
        print("${i+1}º Número: ")
        vetorA.set(i, readLine().toString().toInt())

        if(vetorA.get(i) == 0 || vetorA.get(i) == 1){
            vetorB.set(i, 1)
        }
        else if(vetorA.get(i) == 2){
            vetorB.set(i, 2)
        }
        else if(vetorA.get(i) >= 3){
            for(cont in vetorA.get(i) downTo 1){
                fatorial = fatorial * cont
            }
            vetorB.set(i, fatorial)
        }
    }

    println("-----------------")
    print("Vetor A: ")
    vetorA.forEach { print("$it ") }

    println("\n-----------------")
    print("Vetor B: ")
    vetorB.forEach { print("$it ") }
    println("\n-----------------")
}
