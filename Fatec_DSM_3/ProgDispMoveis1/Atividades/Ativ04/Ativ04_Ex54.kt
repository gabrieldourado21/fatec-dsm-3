fun main(){
    calcularMedia()
}

fun calcularMedia(){
    var primeiraProva = doubleArrayOf(0.0, 0.0, 0.0, 0.0, 0.0)
    var segundaProva = doubleArrayOf(0.0, 0.0, 0.0, 0.0, 0.0)
    var mediasAlunos = doubleArrayOf(0.0, 0.0, 0.0, 0.0, 0.0)

    for(i in 0..4){
        println("${i+1}º Aluno")

        print("1ª Prova: ")
        primeiraProva.set(i, readLine().toString().toDouble())
        print("2ª Prova: ")
        segundaProva.set(i, readLine().toString().toDouble())
        println("----------")

        var media: Double = 0.0
        media = (primeiraProva.get(i) + segundaProva.get(i)) / 2
        mediasAlunos.set(i, media)
    }

    println("Médias dos Alunos")

    for(i in 0..4){
        println("${i+1}º Aluno - ${mediasAlunos.get(i)}")
    }
}
