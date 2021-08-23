package validadorEmail

fun main() {
    val validaEmail = { email: String -> email.contains('@') }

    println("""
        === TESTE VALIDADOR DE  EMAIL ===
        Teste 01 -> Argumento: teste1@gmail.com | Retorno: ${validaEmail("teste1@gmail.com")}
        Teste 02 -> Argumento: teste2.gmail.com | Retorno: ${validaEmail("teste2.gmail.com")}
    """.trimIndent()
    )
}