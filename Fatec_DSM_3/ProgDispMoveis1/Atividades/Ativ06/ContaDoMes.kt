data class ContaDoMes(
    val categoria: String,
    val valor: Double
)

fun main(){
    val contas = arrayListOf(
        ContaDoMes("Água", 40.0),
        ContaDoMes("Energia", 40.0),
        ContaDoMes("Alimentação", 50.0),
        ContaDoMes("Transporte", 30.0),
        ContaDoMes("Streaming", 30.0)
    )

    val calcularTotal = {total: Double, valor: Double -> total + valor}

    val totalContas = contas.map{it.valor}.reduce(calcularTotal)

    println("---------------------------")
    println("Contas do Mês")
    println("---------------------------")

    contas.forEach{
        println("${it.categoria} -> R$ ${it.valor}")
    }

    println("---------------------------")
    println("Valor Total: R$ $totalContas")
    println("---------------------------")
}
