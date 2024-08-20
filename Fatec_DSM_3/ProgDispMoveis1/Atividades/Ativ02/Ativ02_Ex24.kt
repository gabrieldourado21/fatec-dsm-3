fun main(){
    var num: Int = 0

    print("Digite um Número: ")
    num = readLine().toString().toInt()

    print("$num é ")

    if(num % 2 == 0){
        print("par")
    }
    else{
        print("ímpar")
    }
}