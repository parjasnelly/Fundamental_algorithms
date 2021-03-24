import java.util.*

//6. Gere e imprima os n primeiros termos da sequência de Fibonnaci onde n >= 1. Os primeiros termos são:
//0, 1, 1, 2, 3, 5, 8, 13, . . .


fun main() {
    val scan = Scanner(System.`in`)
    println("Digite n:")
    val n = scan.nextInt()
    var a = 0
    var b = 1
    var c: Int
    print("$a, $b")
    for(i in 3..n){
        c = a+b
        print(", $c")
        a = b
        b = c
    }
}