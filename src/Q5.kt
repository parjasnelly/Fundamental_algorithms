import java.util.*
import kotlin.math.pow

//5. Projete um algoritmo que calcule a função sen(x) como definido na série finita

fun fato(n:Int): Int {
    if (n == 0 || n == 1){
        return 1
    }
    else {
        return n*fat(n-1)
    }
}
fun main() {

    var pot = 1
    var sinal = 1
    var term: Double
    var sen = 0.0
    val scan = Scanner(System.`in`)

    println("Digite o valor de x:")
    val x = scan.nextDouble()

    println("Digite o numero de termos:")
    val n = scan.nextInt()

    for (i in 1..n){
        term = x.pow(pot) / fato(pot)
        sen += sinal * term
        sinal *= -1;
        pot += 2;
    }
    println("sen($x)= $sen")
}