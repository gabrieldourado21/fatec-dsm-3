fun main(){
    var notasEscolares = doubleArrayOf(0.0,0.0,0.0,0.0)
    var mediaAluno: Double = 0.0

    for((i, nota) in notasEscolares.withIndex()){
        print("${i+1}ª Nota: ")
        notasEscolares[i] = readLine().toString().toDouble()
        mediaAluno += notasEscolares[i]
    }

    mediaAluno = mediaAluno / 4.0

    println("Média do Aluno: $mediaAluno")

    if(mediaAluno >= 7){
        println("Aprovado")
    }
    else{
        println("Reprovado")
    }
}