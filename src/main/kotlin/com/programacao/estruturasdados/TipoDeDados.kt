package com.programacao.estruturasdados

import java.math.BigDecimal

data class TipoDeDados(
    val string: String,
    val inteiro: Int,
    val booleano: Boolean,
    val long: Long,
    val bigDecimal: BigDecimal,
    val float: Float
) {
    fun pegarParteDaString(index: Int): String {
        return string.substring(index)
    }

    fun subtracao(numero: Int): Int {
        return inteiro.minus(numero)
    }

}