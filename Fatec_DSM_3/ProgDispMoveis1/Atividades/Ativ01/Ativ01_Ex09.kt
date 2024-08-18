fun main(){
    var valorInicial: Double = 0.0
    var taxaJuros: Double = 0.0
    var tempoDias: Int = 0
    var valorTotal: Double = 0.0

    print("Valor Inicial da Prestação: R$ ")
    valorInicial = readLine().toString().toDouble()
    print("Taxa de Juros: ")
    taxaJuros = readLine().toString().toDouble()
    print("Tempo em Dias: ")
    tempoDias = readLine().toString().toInt()

    taxaJuros = taxaJuros / 100
    valorTotal = valorInicial + (valorInicial * taxaJuros * tempoDias)

    println("Valor Total da Prestação: R$ $valorTotal")
}