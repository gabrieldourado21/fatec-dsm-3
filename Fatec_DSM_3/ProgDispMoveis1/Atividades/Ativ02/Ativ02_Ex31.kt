fun main(){
    var num: Int = 0
    var fatorial: Int = 1

    print("Digite um número: ")
    num = readLine().toString().toInt()

    if(num == 0 || num == 1){
        println("$num! = 1")
    }
    else if(num == 2){
        println("$num! = 2")
    }
    else if(num >= 3){
        for(i in num downTo 1){
            fatorial *= i

            if(i == 2){
                break
            }
        }
        println("$num! = $fatorial")
    }
    else{
        println("Número inválido. Digite novamente.")
    }
}