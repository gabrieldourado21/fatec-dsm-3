fun main(){
    var vetorA = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    var vetorB = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

    for(i in 0..9){
        vetorA.set(i, i+1)
        vetorB.set(i, vetorA[i] * 2)
    }

    print("Vetor A: ")
    vetorA.forEach{print("$it ")}
    print("\nVetor B: ")
    vetorB.forEach{print("$it ")}
}