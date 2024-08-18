fun main(){
    var anos: Int = 0
    var meses: Int = 0
    var dias: Int = 0
    var idadeEmDias: Int = 0

    print("Anos: ")
    anos = readLine().toString().toInt()
    print("Meses: ")
    meses = readLine().toString().toInt()
    print("Dias: ")
    dias = readLine().toString().toInt()

    idadeEmDias = (anos * 365) + (meses * 30) + dias

    println("Idade em Dias: $idadeEmDias dias")
}
