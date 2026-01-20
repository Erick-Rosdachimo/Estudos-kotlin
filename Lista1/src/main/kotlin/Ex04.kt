/*
    Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C.
    A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis.
    Quantos chocolates Osmar consegue comer? Por exemplo:

    Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate,
    fazendo com que o número total de chocolates que ele pode comer seja 6.
    Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates que Osmar pode comer.
    C e M são inteiros positivos.

    Entrada	Saída
    10      6
    2
    5
*/

fun ex04(): Int {
    println("Insira a quantidade de dinheiro: ")
    val n = readln().toInt()
    println("Insira o preço do chocolate: ")
    val c = readln().toInt()
    println("Insira a quantidade de embalagens: ")
    val m = readln().toInt()

    var chocolates = 0

    chocolates += n / c
    chocolates += m / 5

    return chocolates
}