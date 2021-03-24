import java.util.*

//1. Dado duas variáveis, a e b, troque os valores atribuídos as mesmas.

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    println("Digite o valor de a:")
    var a = scan.nextInt()
    println("Digite o valor de b:")
    var b = scan.nextInt()
    //exibe valores as variaveis originais
    println("var a = $a var b = $b")
    //troca os valores das var's
    var aux = a

    a = b
    b = aux
    // exibe as var's
    println("var a = $a var b = $b")
}