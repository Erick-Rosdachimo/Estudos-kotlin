/*
    Faça um programa que construa dois vetores A e B de 5 posições, lendo e
    adicionando valores inteiros a esses vetores. Crie um terceiro vetor C,
    composto pela soma dos elementos de A e B. Por exemplo:

    C[0] = A[0] + B[0]
    C[1] = A[1] + B[1]

    Após isso, escreva o conteúdo do vetor C, separados por vírgula.
    Qualquer situação fora do domínio de entrada resulta em saída uma “Erro”.

    Exemplos de entrada e saída esperada:

    Entrada = 2 5 8 34 5               | Saída = 10, 56, 10, 50, 10
              8 51 2 16 5
    Entrada = -10 0 10 20 30           | Saída = 90, 50, 10, -30, -70
              100 50 0 -50 -100
*/

fun ex02(): String{
    val tamanhoVetor = 5
    println("Insira os números do primeiro vetor:")
    val vetor1 = readln().split(" ").filter { it.toIntOrNull() != null }.map { it.toInt() }
    if (vetor1.size != tamanhoVetor) return "Erro"

    println("Insira os números do segundo vetor:")
    val vetor2 = readln().split(" ").filter { it.toIntOrNull() != null }.map { it.toInt() }
    if (vetor2.size != tamanhoVetor) return "Erro"

    val novoVetor = mutableListOf<Int>()

    for(i in 0..<tamanhoVetor){
        novoVetor.add(vetor1[i] + vetor2[i])
    }

    return novoVetor.joinToString(", ")
}