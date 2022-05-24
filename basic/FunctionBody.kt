package basic

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
class FunctionBody {

    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    // function body can be an expression
    fun sum(a: Int, b: Int, c: Int) = a + b + c

    // Unit return type returns no meaningful value
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

    // Unit return type can be omitted
    fun voidFun(a: Int, b: Int) {
        println("void function args: [$a, $b]")
    }
}

fun main() {
    val function = FunctionBody()
    println(function.sum(1, 2))
    println(function.sum(1, 2, 3))
    function.printSum(1, 2)
    function.voidFun(1, 2)
}