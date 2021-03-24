import java.util.*

//4. Dado um número n, compute o fatorial de n (denotado como n!) onde n>= 0

fun fat(n:Int): Int {
    if (n == 0 || n == 1){
        return 1
    }
    else {
        return n*fat(n-1)
    }
}
fun main() {
    val scan = Scanner(System.`in`)
    println("Digite o numero a ser calculado:")
    val n = scan.nextInt()

    println("${n}! = ${fat(n)}")
}