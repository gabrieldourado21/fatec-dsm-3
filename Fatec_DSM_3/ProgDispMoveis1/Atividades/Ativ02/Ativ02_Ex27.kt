fun main(){
    var codigoPedido: Int = 0
    var quantPedido: Int = 0
    var valorPedido: Double = 0.0

    var especificacoes = arrayOf(
        "Cachorro Quente",
        "Bauru Simples",
        "Bauru com Ovo",
        "Hambúrguer",
        "Cheeseburguer",
        "Refrigerante")

    var codigos = intArrayOf(100, 101, 102, 103, 104, 105)
    var precos = doubleArrayOf(1.20, 1.30, 1.50, 1.20, 1.30, 1.0)

    print("Código do Pedido: ")
    codigoPedido = readLine().toString().toInt()
    print("Quantidade: ")
    quantPedido = readLine().toString().toInt()

    when(codigoPedido){
        100 -> valorPedido = quantPedido * precos[0]
        101 -> valorPedido = quantPedido * precos[1]
        102 -> valorPedido = quantPedido * precos[2]
        103 -> valorPedido = quantPedido * precos[3]
        104 -> valorPedido = quantPedido * precos[4]
        105 -> valorPedido = quantPedido * precos[5]
    }

    if(valorPedido <= 0){
        println("Erro. Tente novamente.")
    }
    else{
        println("Valor do Pedido: R$ $valorPedido")
    }
}