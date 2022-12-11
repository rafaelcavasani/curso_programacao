package com.programacao.estruturasdados

fun main() {
    var a = 10
    val b = 5
    val strA = "10"
    val strB = "5"

    // + -> Soma
    println("Soma: ")
    println(a + b)
    println(a.plus(b))
    // + -> concatenação de strings
    println("Concatenação: ")
    println(strA + strB)
    println(strA.plus(strB))

    // += Soma na própria variavel
    // a = a + b
    a = 10
    println("Soma na própria variavel: ")
    a += b
    println(a)

    // - subtração
    println("Subtração: ")
    println(a - b)
    println(a.minus(b))

    // -= Subtração na própria variavel
    // a = a - b
    a = 10
    println("Subtração na própria variavel: ")
    a -= b
    println(a)

    // * Multiplicação
    println("Multiplicação: ")
    println(a * b)
    println(a.times(b))

    // *= Multiplicação na própria variavel
    // a = a * b
    a = 10
    println("Multiplicação na própria variavel: ")
    a *= b
    println(a)

    // / Divisão
    println("Divisão: ")
    println(a / b)
    println(a.div(b))

    // /= Divisão na própria variavel
    // a = a / b
    a = 10
    println("Divisão na própria variavel: ")
    a /= b
    println(a)

    a = 10
    // / Módulo
    println("Módulo: ")
    println(a % b)
    println(a.mod(b))

    // > Maior que
    println("Maior que: ")
    println(a > b)

    // < Menor que
    println("Menor que: ")
    println(a < b)

    // >= Maior ou igual que
    println("Maior ou igual que: ")
    println(a >= b)

    // <= Menor ou igual que
    println("Menor ou igual que: ")
    println(a <= b)

    // == Igual a
    println("Igual que: ")
    println(a == b)
    println(strA == strB)

    // != Diferente de
    println("Diferente que: ")
    println(a != b)
    println(strA != strB)

    // ++ Incremento
    println("Incremento: ")
    a = 10
    a++
    println(a)

    // ++ Decremento
    println("Decremento: ")
    a = 10
    a--
    println(a)

    val c = 2
    // && retorna verdadeiro se todas as expressões são verdadeiras
    println((a > b) && (a > c))

    // || retorna verdadeiro se alguma das expressões for verdadeira
    println((a == b) || (a > c))

    // ! inverte o resultado
    println(a > b)
    println(!(a > b))
}



