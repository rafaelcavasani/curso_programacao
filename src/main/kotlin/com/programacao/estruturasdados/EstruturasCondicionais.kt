package com.programacao.estruturasdados

fun main() {
    val a = 10
    val b = 5
    val c = 12

    if (a > b) {
        println("A é maior que B")
    } else {
        println("A não é maior que B")
    }

    if (a > b && b > c) {
        println("Expressão 1 verdadeira")
    } else if (a > b && c > b) {
        println("Expressão 2 verdadeira")
    } else if (a < b && c > b) {
        println("Expressão 3 verdadeira")
    } else {
        println("Nenhuma expressão é verdadeira")
    }

    when(a) {
        in 0..10 -> println("Expressão 1 verdadeira")
        in 11..30 -> println("Expressão 2 verdadeira")
        in 31..100 -> println("Expressão 3 verdadeira")
        else -> println("Nenhuma expressão é verdadeira")
    }

    val status = "ativo"
    when(status) {
        "ativo" -> println("Clique para inativar")
        "inativo" -> println("Clique para ativar")
        else -> println("Status inválido")
    }

}