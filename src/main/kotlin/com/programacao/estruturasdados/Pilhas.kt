package com.programacao.estruturasdados

import java.util.Stack

fun main() {
    val pilha = Stack<Int>()
    pilha.push(1)
    pilha.push(2)
    pilha.push(3)

    println(pilha.peek())
    pilha.pop()
    println(pilha.peek())
    pilha.pop()
    println(pilha.peek())

}