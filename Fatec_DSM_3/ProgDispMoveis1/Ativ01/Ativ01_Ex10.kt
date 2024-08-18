fun main(){
    var cotacaoDolar: Double = 0.0
    var valorDolares: Double = 0.0
    var conversaoReais: Double = 0.0

    print("Cotação do Dólar: ")
    cotacaoDolar = readLine().toString().toDouble()
    print("Valor em Dólares: US$ ")
    valorDolares = readLine().toString().toDouble()

    conversaoReais = valorDolares * cotacaoDolar
    println("Valor Convertido: R$ $conversaoReais")
}