package org.example.media

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val notas = mutableListOf<Double>()
    val list = listOf<String>("primeiro", "segundo", "terceiro")

    for (i in list.indices) {
        println("Digite a ${list[i]} nota: ")
        val nota = input.nextDouble()
        notas.add(nota)
    }

    val nota1 = notas[0] * 2
    val nota2 = notas[1] * 3
    val nota3 = notas[2] * 5

    val media = (nota1 + nota2 + nota3) / (2 + 3 + 5)

    println("Média: %.1f\n".format(media))
}