package basic

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
class Classes {
    // Inheritance between classes is declared by a colon(:)
    // Classes are final by default, to make a class inheritable, mark it as `open`
    open class Shape

    // property of a class can be listed in its declaration or body:
    class Rectangle(var height: Double, var length: Double) : Shape() {
        var perimeter = (height + length) * 2

        override fun toString(): String {
            return "Rectangle(height=$height, length=$length, perimeter=$perimeter)"
        }
    }
}

fun main() {
    // default constructor with parameters listed in the class declaration
    // is available automatically
    val rectangle = Classes.Rectangle(5.0, 2.0)
    println(rectangle)
}