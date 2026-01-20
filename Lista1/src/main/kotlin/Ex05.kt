/*
    A avenida principal da cidade de Algoritmopolis possui limite de velocidade de L km/h.
    Se o motorista ultrapassar essa velocidade, é aplicado uma multa de R$ M, mais R$ A
    por cada km acima do limite. Faça um programa que leia o limite L, o valor da multa M,
    o valor adicional A e a velocidade V captada pelo radar e informe o valor total da multa.
    Considere L e V sempre como números inteiros. Apresente a resposta com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada	    Saída
    60          200.00
    150.00
    10.00
    65

    Entrada	    Saída
    60          0.00
    150.00
    10.00
    50
*/

fun ex05(): Float {
    println("Insira o limite de velocidade: ")
    val l = readln().toInt()
    println("Insira o valor da multa: ")
    val m = readln().toFloat()
    println("Insira o valor da por KM ultrapassado: ")
    val a = readln().toFloat()
    println("Insira a velocidade captada: ")
    val v = readln().toInt()

    if (l >= v) return 0.00f
    val result = m + ((v - l) * a)
    return result
}