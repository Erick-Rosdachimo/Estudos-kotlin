/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/

fun ex09(): String {
    val idades = mutableListOf<Int>()

    while (true) {
        print("Insira idade para a contagem e negativo para terminar: ")
        val idade = readln().toIntOrNull() ?: continue
        if (idade < 0) break
        idades += idade
    }

    if (idades.isEmpty()) return "0.00 0 0.00%"

    val media = idades.average()
    val maiores = idades.count { it >= 18 }
    val porcentagemIdosas = idades.count { it >= 75 } * 100.0 / idades.size

    return "%.2f %d %.2f%%".format(media, maiores, porcentagemIdosas)
}