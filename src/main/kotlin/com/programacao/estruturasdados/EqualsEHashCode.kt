package com.programacao.estruturasdados

import com.programacao.poo.Categoria
import com.programacao.poo.Produto
import java.math.BigDecimal

class EqualsEHashCode : Produto {

    constructor(
        id: Long,
        nome: String,
        valor: BigDecimal,
        categoria: Categoria,
        estoque: Int
    ) : super(
        id = id,
        nome = nome,
        valor = valor,
        categoria = categoria,
        estoque = estoque
    )

    override fun toString(): String {
        return "Computador(id: $id, nome: $nome, valor: $valor, categoria: $categoria, estoque: $estoque)"
    }

    override fun equals(other: Any?): Boolean {
        if (javaClass != other?.javaClass) return false
        if (other.hashCode() == this.hashCode()) {
            return true
        }
        return false
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + id.hashCode()
        result = prime * result + nome.hashCode()
        result = (prime * result + valor.hashCode())
        return result
    }
}

fun main() {
    val produto1 = Produto(
        id = 1,
        nome = "Teclado",
        valor = BigDecimal(50),
        categoria = Categoria.INFORMATICA,
        estoque = 10
    )

    val produto2 = Produto(
        id = 1,
        nome = "Mouse",
        valor = BigDecimal(5),
        categoria = Categoria.INFORMATICA,
        estoque = 10
    )

    println(produto1.equals(produto2))

    val produto3 = EqualsEHashCode(
        id = 1,
        nome = "Teclado",
        valor = BigDecimal(50),
        categoria = Categoria.INFORMATICA,
        estoque = 10
    )

    val produto4 = EqualsEHashCode(
        id = 2,
        nome = "Mouse",
        valor = BigDecimal(5),
        categoria = Categoria.INFORMATICA,
        estoque = 10
    )

    println(produto3.equals(produto4))
    println(produto3.equals(produto3))

    val produto5 = EqualsEHashCode(
        id = 2,
        nome = "Mouse",
        valor = BigDecimal(5),
        categoria = Categoria.INFORMATICA,
        estoque = 10
    )
    println(produto4.equals(produto5))

}