fun verificaString(variavel: String?): Boolean {
    // Verifica se a variável não é nula e se contém pelo menos um caractere
    return !variavel.isNullOrEmpty()
}

fun main() {
    
    val minhaVariavel1 = "Isso é uma string"
    if (verificaString(minhaVariavel1)) {
        println("Teste 1: A variável contém uma string.")
    } else {
        println("Teste 1: A variável NÃO contém uma string.")
    }

    // Teste 2: Variável nula
    val minhaVariavel2: String? = null
    if (verificaString(minhaVariavel2)) {
        println("Teste 2: A variável contém uma string.")
    } else {
        println("Teste 2: A variável NÃO contém uma string.")
    }

    // Teste 3: Variável vazia
    val minhaVariavel3 = ""
    if (verificaString(minhaVariavel3)) {
        println("Teste 3: A variável contém uma string.")
    } else {
        println("Teste 3: A variável NÃO contém uma string.")
    } 
}