package com.programacao.poo

import java.math.BigDecimal
import kotlin.properties.Delegates

open class Produto {
    protected var id by Delegates.notNull<Long>()
    protected var nome by Delegates.notNull<String>()
    protected var valor by Delegates.notNull<BigDecimal>()
    protected var categoria by Delegates.notNull<Categoria>()
    protected var estoque by Delegates.notNull<Int>()

    constructor(id: Long, nome: String, valor: BigDecimal, categoria: Categoria, estoque: Int) {
        this.id = id
        this.nome = nome
        this.valor = valor
        this.categoria = categoria
        this.estoque = estoque
    }

    fun adicionaEstoque(quantidade: Int) {
        estoque += quantidade
    }

    fun removeEstoque(quantidade: Int) {
        estoque -= quantidade
    }

    fun obterValor(): BigDecimal {
        return this.valor
    }

    override fun toString(): String {
        return "Produto(id: $id, nome: $nome, valor: $valor, categoria: $categoria, estoque: $estoque)"
    }

}