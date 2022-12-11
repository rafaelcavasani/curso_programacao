package com.programacao.estruturasdados

import com.programacao.poo.Categoria
import com.programacao.poo.Produto
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val lista = mutableListOf<Produto>(
        Produto(1, "Teclado", BigDecimal(10.99), Categoria.INFORMATICA, 10),
        Produto(2, "Monitor", BigDecimal(300.99), Categoria.INFORMATICA, 9),
        Produto(3, "Mouse", BigDecimal(5.99), Categoria.INFORMATICA, 8),
    )
    lista.forEach { produto -> println(produto) }

    for (produto in lista) {
        println(produto)
    }

//    val listaAtualizada = lista.map { produto -> produto.removeEstoque(1); produto }
//    listaAtualizada.forEach { produto -> println(produto) }

    // total da compra
    var soma = 0.toBigDecimal()
    for (produto in lista) {
        soma += produto.obterValor()
    }
    println("soma: ${soma.setScale(2, RoundingMode.DOWN)}")

    var valorTotal = lista.sumOf { it.obterValor() }
    println("valor total: ${valorTotal.setScale(2, RoundingMode.DOWN)}")

    println("While")
    while (valorTotal < 500.toBigDecimal()) {
        lista.add(
            Produto(
                (lista.size + 1).toLong(),
                "Produto teste",
                10.toBigDecimal(),
                categoria = Categoria.INFORMATICA,
                1
            )
        )
        valorTotal = lista.sumOf { it.obterValor() }
        println("soma total: " + valorTotal)
    }

    println("Do while")
    val doWhileLista = mutableListOf<Produto>(
        Produto(1, "Teclado", BigDecimal(10.99), Categoria.INFORMATICA, 10),
        Produto(2, "Monitor", BigDecimal(300.99), Categoria.INFORMATICA, 9),
        Produto(3, "Mouse", BigDecimal(5.99), Categoria.INFORMATICA, 8),
    )
    var doWhileValorTotal = doWhileLista.sumOf { it.obterValor() }
    do {
        doWhileLista.add(
            Produto(
                (doWhileLista.size + 1).toLong(),
                "Produto teste",
                10.toBigDecimal(),
                categoria = Categoria.INFORMATICA,
                1
            )
        )
        doWhileValorTotal = doWhileLista.sumOf { it.obterValor() }
        println("soma total: " + doWhileValorTotal)
    } while(doWhileValorTotal < 500.toBigDecimal())
}