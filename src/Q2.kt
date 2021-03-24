import java.util.*

//2. Dado um conjunto das notas de um exame de n, construa um algoritmo que realize a contagem dos alunos
//que foram aprovados no exame. Um aluno é considerado aprovado quando ele consegue uma nota maior do
//que 50 (as notas variam entre 0 e 100).

fun main() {
    val scan = Scanner(System.`in`)
    var score: Int
    var counter = 0
    println("Digite a quantidade de notas:")
    val n = scan.nextInt()
    for (i in 0 until n){
        println("Digite a nota nº${i+1}:")
        score = scan.nextInt()
        if(score>50) counter++
    }
    println("$counter alunos foram aprovados!")
}