import kotlin.math.ceil

/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           5 20.00
    3
    5
    3

    Entrada	    Saída
    10.0        18 180.00
    2.0
    5.0
    7
*/

fun ex06(): String {
    fun readFloat(prompt: String): Float =
        print(prompt).let {
            readln().toFloatOrNull()?.takeIf { it > 0 } ?: return 0f
        }

    val custo = readFloat("Insira o custo da lata de tinta: ")
    val rendimento = readFloat("Insira o rendimento da lata de tinta: ")
    val largura = readFloat("Insira a largura da parede: ")
    val altura = readFloat("Insira a altura da parede: ")

    val area = largura * altura
    val latas = ceil(area / rendimento).toInt()
    val custoTotal = latas * custo

    return "$latas $custoTotal"
}