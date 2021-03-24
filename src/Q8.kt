
import java.util.Scanner

//8. Projete um algoritmo que converta um número inteiro para sua respectiva representação em octal.


    fun main() {
        val scan = Scanner(System.`in`)
        print("Informe um número inteiro decimal: ")
        val n = scan.nextInt()

        var q = n
        val rest = mutableListOf<Int>()

        while (q > 0) {
            rest.add(q%8)
            q = Math.floorDiv(q, 8)
        }

        println("Número em decimal: $n")
        print("Número em octal: ")
        rest.asReversed().forEach{
            print(it)
        }
    }
