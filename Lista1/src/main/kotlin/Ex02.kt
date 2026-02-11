/*
    Sejam a, b e c os três lados de um triângulo. Elabore um algoritmo que verifica se o triângulo é:

    Escaleno (todos os lados diferentes)
    Isósceles (possui dois lados iguais)
    Equilátero (todos os lados iguais)
    Não forma triângulo (a soma de dois lados deve ser maior que o terceiro lado)
    Os três números devem ser inteiros positivos e lidos na mesma linha (Ex: 3 4 5) Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 2 3 2 | Saída = Isosceles
    Exemplo 2: Entrada = 2 2 2 | Saída = Equilátero
    Exemplo 3: Entrada = 1 2 4 | Saída = Não forma triângulo
    Exemplo 4: Entrada = -1 2 4 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

fun ex02 (): String {
    print("Insira os números para verificar que tipo de triângulo é: ")
    val lados = readln()
        .trim()
        .split(Regex("\\s+"))
        .mapNotNull { it.toIntOrNull() }
        .sorted()
        .takeIf { it.size == 3 && it.first() > 0 }
        ?: return "Erro"

    return when {
        lados[0] + lados[1] <= lados[2] -> "Não forma triângulo"
        lados.distinct().size == 1 -> "Equilátero"
        lados.distinct().size == 2 -> "Isosceles"
        else -> "Escaleno"
    }
}