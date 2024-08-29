fun main(){
    var vetor = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

    for(i in 0..9){
        vetor.set(i, i+1)
    }

    vetor.forEach{print("$it ")}
}
