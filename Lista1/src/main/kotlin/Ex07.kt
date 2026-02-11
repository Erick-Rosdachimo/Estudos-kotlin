/*
    Um motorista de Uber estipula o preço de uma determinada viagem dada a quantidade de quilômetros percorrida.
    Para viagens de até X km, é cobrado um valor R$ V1 por km. Acima de X km, é cobrado o valor R$ V2.
    Faça um programa que leia X, V1, V2 e a quantidade de quilômetros A da viagem e imprima o valor total
    com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada    	Saída
    100         75.00
    1.50
    1.25
    50
    Entrada    	Saída
    100         187.50
    1.50
    1.25
    150
*/

fun ex07(): String {
    fun readFloat(prompt: String): Float =
        print(prompt).let {
            readln().toFloatOrNull() ?: return 0f
        }

    val distanciaBase = readFloat("Insira a distancia base: ")
    val valor1 = readFloat("Insira o valor 1: ")
    val valor2 = readFloat("Insira o valor 2: ")
    val distanciaViagem = readFloat("Insira a distancia da viagem: ")

    val total = if (distanciaViagem <= distanciaBase) {
        distanciaViagem * valor1
    } else {
        distanciaViagem * valor2
    }

    return "%.2f".format(total)
}