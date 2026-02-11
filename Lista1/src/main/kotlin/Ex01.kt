/*
    Uma livraria está fazendo uma promoção para pagamento a vista. O comprador pode escolher entre dois planos de pagamento:

    Critério A: R$ 0,25 por livro + R$ 7,50 fixo
    Critério B: R$ 0,50 por livro + R$ 2,50 fixo
    Faça um programa em que o usuário informe a quantidade positiva e não nula de livros seja impress qual o melhor plano de pagamento.

    Exemplo 1: Entrada = 100 | Saída = Criterio A
    Exemplo 2: Entrada = 5 | Saída = Criterio B
    Exemplo 3: Entrada = 20 | Saída = Indiferente
    Exemplo 4: Entrada = -5 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

fun ex01 (): String {
    print("Insira um número: ")
    val quant = readln().toIntOrNull()
        ?.takeIf { it > 0 }
        ?: return "Erro"

    val criterioA = quant * 0.25 + 7.5
    val criterioB = quant * 0.50 + 2.5

    return when{
        criterioA < criterioB -> "Criterio A"
        criterioA > criterioB -> "Criterio B"
        else -> "Erro"
    }
}