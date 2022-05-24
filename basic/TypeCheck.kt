package basic

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
class TypeCheck {

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            return obj.length
        }
        return null
    }

    fun getStringLength2(obj: Any): Int? {
        if (obj !is String) {
            return null;
        }
        return obj.length
    }

    fun getStringLength3(obj: Any): Int? {
        if (obj is String && obj.length > 0) {
            return obj.length
        }
        return null
    }
}

fun main() {
    val typeCheck = TypeCheck()
    println(typeCheck.getStringLength("hello"))
    println(typeCheck.getStringLength(3.14))

    println(typeCheck.getStringLength2("hello"))
    println(typeCheck.getStringLength3("world"))
}