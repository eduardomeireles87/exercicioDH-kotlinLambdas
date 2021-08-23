package itensLista

fun main() {
    val lista = { lista: List<Int> ->
        var produto = 1
        if (lista.isEmpty()) {
            0
        } else {
            for (numero in lista) produto *= numero
            produto
        }
    }
    println(lista(listOf(1,2)))
}