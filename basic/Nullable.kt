package basic

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
class Nullable {

    // Nullable type names have ? at the end
    // A reference must be explictly marked as nullable when null value is possable
    fun parseInt(str: String): Int? {
        if (str.isBlank()) {
            return null;
        }
        return str.toInt()
    }

    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        if (x == null) {
            println("Wrong number format in arg1: '$arg1'")
            return
        }
        if (y == null) {
            println("Wrong number format in arg2: '$arg2'")
            return
        }
        println(x * y)
    }
}

fun main() {
    val nullable = Nullable()
    nullable.printProduct("", "")
    nullable.printProduct("1", "")
    nullable.printProduct("1", "2")
}