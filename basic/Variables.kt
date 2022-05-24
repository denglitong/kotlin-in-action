package basic

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
class Variables {

    fun valFunc() {
        // Read-only local variables are defined using the keyword `val`
        // They can be assigned a value only once.
        val a: Int = 1; // immediate assignment
        val b = 2 // `Int` type is inferred
        val c: Int // Type required when no initializer is provide
        c = 3 // delayed assignment
    }

    fun varFun() {
        // Variables that can be reassigned use the keyword `var`
        var x: Int = 5
        x += 1
    }

}