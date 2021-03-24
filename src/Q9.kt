import java.util.Scanner

//9. Dado um representaćào em caractere de um número inteiro, projete um algoritmo que converta para sua
//representação inteira.

fun main() {
    val scan = Scanner(System.`in`)
    print("Informe caracteres numéricos: ")
    val str = scan.next()

    var int = 0
    for (i in str.indices){
        int = int * 10 + str.codePointAt(i) - 48
    }
    println("O caractere em Int é: $int")
}