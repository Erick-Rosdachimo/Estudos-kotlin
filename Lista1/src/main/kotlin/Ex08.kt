/*
    Alan quer comprar limões para fazer uma limonada. Próximo da sua casa há um mercadinho que vende limões da seguinte
    forma: O primeiro limão é vendido por C centavos, o segundo por C − 1 centavos, o terceiro por C − 2 e assim
    por diante até o menor valor de 1 centavo. Por exemplo, se C = 3 e Alan quiser comprar *5* limões, o preço total
    será 3 + 2 + 1 + 1 + 1 = 8.

    Faça um programa que leia dois inteiros *N* e *C* que indicam respectivamente o número de limões e o valor em
    centavos do primeiro limão. Em seguida imprima o valor total em centavos.

    ### Exemplos de entrada e saída:

    | Entrada  | Saída  |
    | -------  | ------ |
    | 5 3      | 8      |
    | 3 3      | 6      |

    Fonte: Adaptado de https://neps.academy/problem/193
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
*/

fun ex08(): Int{
    println("Insira a quantidade de limões: ")
    val quantidade = readln().toIntOrNull()?.takeIf { it > 0 } ?: return 0
    println("Insira o preço do primeiro limão: ")
    var precoInicial = readln().toIntOrNull()?.takeIf { it > 0 } ?: return 0

    return (0..<quantidade)
        .sumOf { i ->
            (precoInicial - i).coerceAtLeast(1)
        }
}