class Funcionario() {
    var nomeFunc: String
    var salarioBruto: Double
    var desconto: Double

    init {
        this.nomeFunc = ""
        this.salarioBruto = 0.0
        this.desconto = 0.0
    }

    fun calcularSalarioLiquido(): Double{
        var desc: Double = this.desconto / 100
        var salarioLiquido: Double = this.salarioBruto - (this.salarioBruto * desc)

        return salarioLiquido
    }

    fun aumentarSalario(porcentagem: Double): Double{
        var salarioAtual: Double = calcularSalarioLiquido()
        var porcent: Double = porcentagem / 100
        var novoSalario: Double = salarioAtual + (salarioAtual * porcent)

        return novoSalario
    }
}