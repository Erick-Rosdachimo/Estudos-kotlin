/*
    Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

fun ex03(): String{
    println("Insira os números do vetor inicial:")
    val inicial = readln()
        .split(" ")
        .filter { it.toIntOrNull() != null }
        .map { it.toInt() }

    if (inicial.size != 5) return "Erro"
    if (inicial.toSet().size != 5) return "Erro"

    val vetor = inicial.toMutableList()

    while (vetor.isNotEmpty() && vetor.size < 10) {
        println("Insira o proximo numero:")
        val entrada = readln().toIntOrNull() ?: return "Erro"

        if (entrada in vetor) {
            vetor.remove(entrada)
        } else {
            vetor.add(entrada)
        }

        println(vetor.joinToString(" "))
    }

    return "Fim"
}