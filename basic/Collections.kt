package basic

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
class Collections {

    val items = listOf("hello", "world")

    fun iterate() {
        for (item in items) {
            print(item + " ")
        }
        println()

    }

    fun inCollectionCheck(a: String) {
        when {
            a in items -> println("$a is in $items")
            a !in items -> println("$a is not in $items")
        }
    }

    fun lambda() {
        items.filter { it.startsWith("h") }
            .sortedBy { it }
            .map { it.uppercase() }
            .forEach(::println)
    }
}

fun main() {
    val coll = Collections()
    coll.iterate()
    coll.inCollectionCheck("hello")
    coll.inCollectionCheck("HELLO")
    coll.lambda()
}