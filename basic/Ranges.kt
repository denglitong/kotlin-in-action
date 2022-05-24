package basic

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
class Ranges {
    fun withinRange() {
        val x = 10
        val y = 9
        // check if within a range
        if (x in 1..y + 1) {
            println("fits in range")
        }
    }

    fun outOfRange() {
        val list = listOf("a", "b", "c")
        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        // indices: [0, size-1]
        if (list.size !in list.indices) { // true
            println("list size is out of valid list indices range, too")
        }
    }

    fun iterateRange() {
        for (x in 1..3) {
            println(x)
        }
        (4..6).forEach(::println)
    }

    fun iterateRangeWithStep() {
        for (x in 1..10 step 2) {
            println(x)
        }
    }
}

fun main() {
    val range = Ranges()

    // fits in range
    range.withinRange()
    // -1 is out of range
    // list size is out of valid list indices range, too
    range.outOfRange()
    // 1 2 3 4 5 6
    range.iterateRange()
    // 1 3 5 7 9
    range.iterateRangeWithStep()
}