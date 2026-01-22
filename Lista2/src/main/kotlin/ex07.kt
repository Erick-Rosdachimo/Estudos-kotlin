/*
    Clara está organizando as fotos da sua última viagem num álbum de fotos. Como ela tem muitas fotos, para economizar
    páginas do álbum ela quer colar duas fotos por página do álbum.

    Como as fotos são retangulares, as fotos podem ser coladas giradas (mas sempre com lados paralelos aos da página do
    álbum, para preservar o equilíbrio estético do álbum), mas elas devem sempre ficar inteiramente contidas no interior
    da página, e não devem se sobrepor.

    Em geral, das muitas formas de posicionar as fotos do álbum só algumas (ou nenhuma) satisfazem estas restrições,
    então pode ser difícil decidir se é possível colar as duas fotos em uma mesma página do álbum e, por isso, Clara
    pediu a sua ajuda para escrever um programa que, dadas as dimensões da página e das fotos, decide se é possível
    colar as fotos na página.

    Por exemplo, cada página pode ser 5×7, e duas fotos são 3×4. Nesse caso, é possível colar as duas fotos:
    https://olimpiada.ic.unicamp.br/static/img/task_images/2012f2p2_album.png

    Faça um programa que receba como entrada na primeira linha dois inteiros X e Y, indicando a largura e a altura
    da página do álbum. Cada uma das duas linhas seguintes contém dois inteiros L e H, indicando a largura e a altura
    das fotos.

    Seu programa deve imprimir uma única linha, contendo um único caractere: "S", se é possível colar as duas fotos na
    página do álbum, e "N", caso contrário.

    Exemplos de entrada e saída:

    | Entrada            | Saída  |
    | -------            | ------ |
    | 7 5                | S      |
    | 3 4                |        |
    | 3 4                |        |
    | -------            | ------ |
    | 10 10              | N      |
    | 6 6                |        |
    | 6 6                |        |


    Fonte: Adaptado de Olimpíada Brasileira de Informática (OBI)
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */

fun ex07(): String{
    println("Insira a dimensão da pagina:")
    val (x, y) = readln().split(" ").map { it.toInt() }
    println("Insira a dimensão da foto 1:")
    val (l1, h1) = readln().split(" ").map { it.toInt() }
    println("Insira a dimensão da foto 2:")
    val (l2, h2) = readln().split(" ").map { it.toInt() }

    val min1 = minOf(l1, h1)
    val min2 = minOf(l2, h2)
    val max1 = maxOf(l1, h1)
    val max2 = maxOf(l2, h2)

    if(min1 + min2 <= x && maxOf(max1, max2) <= y) return "S"
    if(min1 + min2 <= y && maxOf(max1, max2) <= x) return "S"
    return "N"
}