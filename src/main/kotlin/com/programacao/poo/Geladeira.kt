package com.programacao.poo

import java.math.BigDecimal
import kotlin.properties.Delegates

class Geladeira: Produto {

    private var motor by Delegates.notNull<String>()

    constructor(id: Long, nome: String, valor: BigDecimal, categoria: Categoria, estoque: Int, motor: String) : super(
        id = id,
        nome = nome,
        valor = valor,
        categoria = categoria,
        estoque = estoque
    ) {
        this.motor = motor
    }

    fun pegarMotor(): String {
        return this.motor
    }

    override fun toString(): String {
        return "Geladeira(id: $id, nome: $nome, valor: $valor, categoria: $categoria, estoque: $estoque, motor: $motor)"
    }

}