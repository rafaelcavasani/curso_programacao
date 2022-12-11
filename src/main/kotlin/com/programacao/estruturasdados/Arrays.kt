package com.programacao.estruturasdados

import java.math.BigDecimal

fun main() {
    var array = Array<BigDecimal>(3) { i -> i.toBigDecimal() }
    array.forEach { println(it) }

    val array2 = arrayOf("A1", "A2")
    array2.forEach { println(it) }
}