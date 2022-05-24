package basic

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
class Conditional {

    fun maxOf1(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    // if can also be used as an expression
    fun maxOf2(a: Int, b: Int) = if (a > b) a else b
}

fun main() {

}