package com.programacao.poo

import java.math.BigDecimal

fun main() {

    val produto = Produto(
        id = 1,
        nome = "Teclado",
        valor = BigDecimal(50),
        categoria = Categoria.INFORMATICA,
        estoque = 10
    )

    println(produto.toString())
    produto.adicionaEstoque(1)
    println(produto.toString())

    val computador = Computador(
        id = 2,
        nome = "Computador 1",
        valor = BigDecimal(5000),
        categoria = Categoria.INFORMATICA,
        estoque = 2,
        processador = "Intel i7"
    )

    println(computador.toString())
    computador.removeEstoque(1)
    println(computador.toString())

    val geladeira = Geladeira(
        id = 2,
        nome = "Geladeira 1",
        valor = BigDecimal(1000),
        categoria = Categoria.ELETRODESTICOS,
        estoque = 5,
        motor = "Motor 1"
    )
    println(geladeira.toString())
}