/*
    Você está na Austrália treinando cangurus para se locomoverem em linha reta. Você quer saber se dois cangurus
    estarão na mesma posição em um determinado tempo, dado a posição inicial de cada canguru e qual a distância que
    eles saltam. Como você sabe programar muito bem, você decidiu fazer um programa para isso. Seu programa deve ler:
     - A posição inicial X1 e a distância do pulo V1 do primeiro canguru.
     - A posição inicial X2 e a distância do pulo V2 do segundo canguru.

    Após isso, seu programa deve imprimir SIM se os dois cangurus se encontrarão no mesmo ponto e NAO caso eles
    nunca se encontrem.

    Por exemplo, o primeiro canguru começa em X1 = 2 e tem uma distância do pulo de V1 = 1. O segundo canguru começa
    em X2 = 1 e tem uma distância de pulo de V2 = 2. Após um pulo ambos estarão no ponto *3*, portanto a respota é SIM.

    ### Exemplos de entrada e saída:

    | Entrada    | Saída  |
    | -------    | ------ |
    | 0  3  4  2 | SIM    |
    | 0  2  5  3 | NAO    |

    Fonte: Adaptado de https://www.hackerrank.com/challenges/kangaroo/problem

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
*/

fun ex10(): String{
    println("Insira a posição do canguru 1: ")
    val x1 = readln().toInt()
    println("Insira a distancia do pulo do canguru 1")
    val v1 = readln().toInt()

    println("Insira a posição do canguru 2: ")
    val x2 = readln().toInt()
    println("Insira a distancia do pulo do canguru 2")
    val v2 = readln().toInt()

    if (v1 == v2) {
        return if (x1 == x2) "SIM" else "NAO"
    }

    val numerador = x1 - x2
    val denominador = v2 - v1

    return if (
        numerador % denominador == 0 &&
        numerador / denominador >= 0
    ) {
        "SIM"
    } else {
        "NAO"
    }
}