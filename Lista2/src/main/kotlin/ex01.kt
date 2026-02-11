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
    print("Insira as temperaturas:")
    val temperaturas = readln()
        .trim()
        .split(Regex("\\s+"))
        .mapNotNull { it.toIntOrNull() }
        .takeIf { it.size == 7  }
        ?: return "Erro"

    return temperaturas.count { it > temperaturas.average() }.toString()
}