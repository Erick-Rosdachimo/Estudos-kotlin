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


    fun lerVetor(): List<Int>? =
        readln()
            .trim()
            .split(Regex("\\s+"))
            .mapNotNull { it.toIntOrNull() }
            .takeIf { it.size == tamanhoVetor }

    print("Insira os números do primeiro vetor:")
    val vetor1 = lerVetor() ?: return "Erro"

    print("Insira os números do segundo vetor:")
    val vetor2 = lerVetor() ?: return "Erro"

    return vetor1
        .zip(vetor2)
        .map { (a, b) -> a + b }
        .joinToString(", ")
}