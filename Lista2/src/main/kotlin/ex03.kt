/*
    Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

    fun ex03(): String{
        print("Insira os números do vetor inicial:")
        val vetor = readln()
            .trim()
            .split(Regex("\\s+"))
            .mapNotNull { it.toIntOrNull() }
            .toMutableList()
            .takeIf { it.size == 5 && it.distinct().size != 5  }
            ?: return "Erro"

        while (vetor.size in 1 ..< 10) {
            println("Insira o proximo numero:")
            val entrada = readln().toIntOrNull() ?: return "Erro"

            if (!vetor.remove(entrada)) {
                vetor.add(entrada)
            }

            println(vetor.joinToString(" "))
        }

        return "Fim"
    }