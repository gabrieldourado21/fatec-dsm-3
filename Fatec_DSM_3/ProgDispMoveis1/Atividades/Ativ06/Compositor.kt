data class Compositor (
    val nome: String,
    val quantComposicoes: Int
)

fun main(){
    val compositores = arrayListOf(
        Compositor("Arthur", 12),
        Compositor("Bianca", 15),
        Compositor("Camila", 18),
        Compositor("Daniel", 21),
        Compositor("Elizabete", 24)
    )

    val maioresCompositores = compositores.filter {
        it.quantComposicoes >= 15
    }

    println("--- Maiores Compositores ---")

    maioresCompositores.forEach {
        println("${it.nome} -> ${it.quantComposicoes}")
    }
}
