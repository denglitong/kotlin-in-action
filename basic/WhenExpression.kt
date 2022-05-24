package basic

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
class WhenExpression {

    // similar to switch but more better
    fun whenFun(obj: Any): String = when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }
}

fun main() {
    val we = WhenExpression()
    println(we.whenFun(1))
    println(we.whenFun("Hello"))
    println(we.whenFun(34L))
    println(we.whenFun(34.56)) // Not a string
    println(we.whenFun("Something unknown")) // Unknown
}