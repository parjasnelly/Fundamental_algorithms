import java.util.*

//3. Dado um conjunto de n numeros, construa um algoritmo que realize e exiba o somatório dos números.
//Assuma que n é maior ou igual a zero.

fun main() {
    val scan = Scanner(System.`in`)
    var score: Int
    var counter = 0
    println("Digite a quantidade de numeros:")
    val n = scan.nextInt()
    for (i in 0 until n){
        println("Digite o numero:")
        score = scan.nextInt()
        counter += score
    }
    println("O somatorio foi: $counter")
}