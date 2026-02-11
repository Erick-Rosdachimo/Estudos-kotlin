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
    print("Tamanho vetor: ")
    val tamanhoVetor = readln().toIntOrNull()?.takeIf { it > 0 } ?: return "Erro"


    print("Vetor 1: ")
    val vetor1 = readln()
        .trim()
        .split(Regex("\\s+"))
        .mapNotNull { it.toIntOrNull() }
        .takeIf { it.size == tamanhoVetor }
        ?: return "Erro"

    print("Vetor 2: ")
    val vetor2 = readln()
        .trim()
        .split(Regex("\\s+"))
        .mapNotNull { it.toIntOrNull() }
        .takeIf { it.size >= tamanhoVetor }
        ?: return "Erro"


    return vetor1
        .zip(vetor2)
        .flatMap { (a,b) -> listOf(a,b) }
        .toString()
}