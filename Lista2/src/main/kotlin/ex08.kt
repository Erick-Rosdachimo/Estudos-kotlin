import kotlin.math.abs

/*
    Todos os Natais o Papai Noel se prepara para embarcar em seu trenó todos os N presentes a serem entregues.
    A área em que os presentes ficam no trenó pode ser dividida em dois lados: o lado A e o lado B. Para que o trenó
    fique equilibrado, a diferença da soma dos pesos dos presentes que estão no lado A e no lado B não pode ser maior
    que 5kg.

    Você recebeu a tarefa de ajudar o Papai Noel este ano. Dados N presentes, você deve descobrir se existe uma
    maneira de dividi-los nos lados A e B, de tal forma que o trenó nunca fique desequilibrado.

    Faça um programa que leia o número de presentes N que o Papai Noel deve entregar. Após isso, leia N números
    inteiros P, representando o peso de cada presente. Os presentes devem ser alocados um por vez, na ordem em que
    são lidos, e em nenhum momento o trenó deve ficar desequilibrado. Seu programa deve imprimir "S" se for possível
    equilibrar todos os presentes no trenó e "N" caso contrário.

    Exemplos de entrada e saída:

    | Entrada      | Saída  |
    | -------      | ------ |
    | 3            | S      |
    | 4 6 2        | S      |
    | -------      | ------ |
    | 2            | N      |
    | 6 6          |        |


    Fonte: Adaptado de https://neps.academy/problem/436
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
*/

fun ex08(): String{
    print("Insira a quantidade de presentes: ")
    val quantidade = readln().toIntOrNull()?.takeIf { it > 0 } ?: return "Erro"

    var totalA = 0
    var totalB = 0

    repeat(quantidade){
        println("Insira o peso do proximo presente:")
        val presente = readln().toIntOrNull()?.takeIf { it > 0 } ?: return "Erro"

        if(totalA > totalB) totalB += presente else totalA += presente
        if(abs(totalB - totalA) > 5) return "N"
    }

    return "S"
}