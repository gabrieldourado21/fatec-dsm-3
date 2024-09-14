fun main(){
    val log = {
        autor: String, commit: String ->
        "$autor - $commit"
    }

    println(log("Gabriel", "Correcao de Bug"))
}
