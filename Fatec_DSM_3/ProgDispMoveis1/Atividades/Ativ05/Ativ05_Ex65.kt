fun main(){
    var func1 = Funcionario()

    println("Dados do Funcionário")

    print("Nome: ")
    func1.nomeFunc = readLine().toString()
    print("Salário Bruto: R$ ")
    func1.salarioBruto = readLine().toString().toDouble()
    print("Desconto (em porcentagem): ")
    func1.desconto = readLine().toString().toDouble()

    var salarioLiquido: Double = func1.calcularSalarioLiquido()
    println("Salário Liquído: R$ $salarioLiquido")

    print("Aumento (em porcentagem): ")
    var novoSalario: Double = func1.aumentarSalario(readLine().toString().toDouble())

    println("----------------------------")
    println("Dados Atualizados")
    println("Nome: ${func1.nomeFunc}")
    println("Salário Antigo: R$ $salarioLiquido")
    println("Novo Salário: R$ $novoSalario")
}
