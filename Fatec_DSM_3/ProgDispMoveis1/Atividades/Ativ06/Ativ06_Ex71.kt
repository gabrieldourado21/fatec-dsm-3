fun main(){
    val nums = intArrayOf(1,3,2,4,6,5,8,7,9)
    val ordemCrescente = nums.sortedBy { it }

    println("Números: ${nums.contentToString()}")
    println("Em Ordem Crescente: $ordemCrescente")
}
