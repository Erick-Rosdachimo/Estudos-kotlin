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
    println("Insira os números para verificar que tipo de triângulo é: ")
    val entrada = readln()
    if (entrada.isEmpty()) return "Erro"
    val numeros = entrada.split(" ").map { it.toInt() }.sorted()

    if (numeros.size != 3 || numeros[0] <= 0) return "Erro"
    if (numeros[0] + numeros[1] <= numeros[2]) return "Não forma triângulo"
    if (numeros[0] == numeros[2]) return "Equilátero"
    if (numeros[0] == numeros[1] || numeros[1] == numeros[2]) return "Isosceles"
    return "Escaleno"
}