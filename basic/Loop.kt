package basic

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
class Loop {
    val items = listOf("apple", "banana", "kiwifruit")

    fun forLoop() {
        for (item in items) {
            println(item)
        }
        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }

    fun whileLoop() {
        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
    }
}

fun main() {
    val loop = Loop()
    loop.forLoop()
    loop.whileLoop()
}