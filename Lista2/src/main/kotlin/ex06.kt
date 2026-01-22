/*
    Faça um programa que leia um valor inteiro N. Após isso, leia dois vetores A e B de tamanho N. Em seguida, o programa
    deve criar um vetor C com os elementos de A e B intercalados.

    Exemplos de entrada e saída:

    | Entrada                 | Saída                         |
    | -------                 | ------                        |
    | 6                       | 5 10 6 20 3 30 8 40 2 50 0 60 |
    | 5 6 3 8 2 0             |                               |
    | 10 20 30 40 50 60       |                               |
      ---
    | 3                       | 1 1 2 1 3 1                   |
    | 1 2 3                   |                               |
    | 1 1 1                   |                               |

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
*/

fun ex06(): String{
    println("Tamanho vetor:")
    val tamanhoVetor = readln().toInt()
    println("Vetor 1:")
    val vetor1 = readln().trim().split(" ").map { it.toInt() }.toMutableList()
    println("Vetor 2:")
    val vetor2 = readln().trim().split(" ").map { it.toInt() }.toMutableList()

    val vetorIntercalado = mutableListOf<Int>()

    for (i in 0..<tamanhoVetor){
        vetorIntercalado.add(vetor1[i])
        vetorIntercalado.add(vetor2[i])
    }

    return vetorIntercalado.joinToString(" ")
}