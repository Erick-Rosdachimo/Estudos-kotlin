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

fun ex09(): String{
    //var acabou = false
    var quantPessoas = 0f
    var totalIdade = 0f
    var quantMaior = 0
    var quantIdosa = 0f

    while (true) {
        println("Insira idade para a contagem e negativo para terminar: ")
        val idade = readln().toInt()

        if (idade < 0) break

        quantPessoas += 1
        totalIdade += idade
        if (idade >= 18) quantMaior += 1
        if (idade >= 75) quantIdosa += 1

    }
    val media = "%.2f".format(totalIdade / quantPessoas)
    val percentagemIdosas = "%.2f".format((quantIdosa / quantPessoas) * 100)


    return "$media $quantMaior $percentagemIdosas%"
}