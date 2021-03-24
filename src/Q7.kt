import java.util.*

//7. Projete um algoritmo que aceita um inteiro positivo e inverta a ordem dos dígitos.


fun main() {
    val scan = Scanner(System.`in`)

    println("Digite um inteiro positivo:")
    val n = scan.nextInt()
    var inverse = 0
    var digit: Int
    var q = n

    while(q>0){
        digit = q % 10
        inverse = inverse * 10 + digit
        q = Math.floorDiv(q, 10)
    }
    println("numero invertido: $inverse")
}