/*
    Faça um programa que leia dados inteiros da temperatura diária durante uma semana,
    armazenando em um vetor. Na sequência, escreva quantos dias dessa semana a temperatura
    esteve acima da média. As sete temperaturas devem ser lidas na mesma linha, separada
    por espaço.

    Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 2 2 2 2 2 2 3 | Saída = 1
    Exemplo 2: Entrada = 21 10 13 34 30 21 34 | Saída = 3
    Exemplo 3: Entrada = 2 2 2 2 2 2 1 | Saída = 6
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

fun ex01(): String{
    println("Insira as temperaturas:")
    val entrada = readln().split(" ")

    val temperaturas = entrada.mapNotNull { it.toIntOrNull() }

    if (temperaturas.size != 7 || entrada.size != 7) return "Erro"

    val mediaTemperatura = temperaturas.average()
    val quantMaiorMedia = temperaturas.count { it > mediaTemperatura }
    return quantMaiorMedia.toString()
}