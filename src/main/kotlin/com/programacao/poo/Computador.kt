package com.programacao.poo

import java.math.BigDecimal
import kotlin.properties.Delegates

class Computador: Produto {

    private var processador by Delegates.notNull<String>()

    constructor(id: Long, nome: String, valor: BigDecimal, categoria: Categoria, estoque: Int, processador: String) : super(
        id = id,
        nome = nome,
        valor = valor,
        categoria = categoria,
        estoque = estoque
    ) {
        this.processador = processador
    }

    override fun toString(): String {
        return "Computador(id: $id, nome: $nome, valor: $valor, categoria: $categoria, estoque: $estoque, processador: $processador)"
    }

}