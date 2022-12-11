package com.programacao.estruturasdados

import java.util.Collections

fun main() {
    // List
    println("Lista")
    val lista = mutableListOf<String>("3", "2", "1")
    println(lista.toString())
    lista.add("4")
    println(lista.toString())
    lista.removeAt(3)
    println(lista.toString())

    // Set
    println("Set")
    val set = mutableSetOf<String>("3", "2", "1")
    set.add("4")
    set.add("4")
    set.add("4")
    set.add("4")
    println(set)

    // Map
    val map = mutableMapOf<String, Any>(
        "1" to "1",
        "2" to 2,
        "3" to true
    )
    map.put("4", "4")
    println(map)
    println(map.get("3"))


    // iterações - List / Set
//    lista.forEach {  }
//    lista.map {  }
//    lista.reduce { acc, s ->  }
//    lista.filter {  }
//    lista.first {  }
//    lista.find {  }

    // iterações - Map
//    map.forEach { k, v ->  }
//    map.map {  }

}