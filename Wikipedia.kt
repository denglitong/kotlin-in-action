import java.awt.Point

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 * https://zh.wikipedia.org/zh-cn/Kotlin
 */
class Wikipedia {
    val immutableValue1: Int = 1
    val immutableValue2 = 2

    // all property is public unless you defined as private or protected
    var page: Int = 5
        // default getter generated
        get() {
            // the keyword `field` represent the property itself
            return field
        }
        // get() = x
        // default setter generated
        set(value) {
            field = value
        }

    fun validateWikipedia(page: Int) {
        // nested function
        fun validate(pedia: Wikipedia, page: Int) {
            if (pedia.page < page) {
                println("Wikipedia page ${pedia.page} is less than given ${page}")
            } else if (pedia.page == page) {
                println("Wikipedia page ${pedia.page} is euqal given ${page}")
            } else {
                println("Wikipedia page ${pedia.page} is greater given ${page}")
            }
        }
        validate(this, page)
        validate(this, page - 10)
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val scope = "world"
    println("Hello, $scope!")

    println("Kotlin".lastChar())

    var p1 = Point(10, 20)
    var p2 = Point(30, 40)
    println(p1 + p2)

    var wikipedia: Wikipedia = Wikipedia()
    wikipedia.page += 1
    println(wikipedia.page)
    wikipedia.validateWikipedia(10)

    // 解包引数
    var list = listOf("args: ", *args) // [args: , arg1, arg2]
    println(list)
    println(listOf("args: ", args)) // [args: , [Ljava.lang.String;@2d98a335]

    println(User("Litong"))
    println(User("Litong", 10))

    println(greeting) // hello
    greeting.print() // hello

    greeting andAnother "world"
    println(greeting) // hello
    println(greeting andAnother "world") // hello world
    println(greeting andAnother ("world")) // hello world
    println(greeting.andAnother("world")) // hello world
    println(greeting) // hello

    println(greet { "world" }) // hello world

    val name = "lord"
    println(greet({ s: String -> "my dear $s" }, name)) // hello my dear lord

    greet { "world" }.print() // hello world
    greet { to.place }.print() // hello world

    sayHello("Litong", 0) // hello Litong
    sayHello(null, 0) // hello stranger
    // sayHello(null, null) // won't compile

    // Elvis operator:
    // returns null if...
    // - foo() returns null,
    // - or if foo() is non-null, but bar() returns null,
    // - or if foo() and bar() are non-null, but baz() returns null.
    // vice versa, return value is non-null if and only if foo(), bar() and baz() are non-null
    // foo()?.bar()?.baz()

    lambda1("hello world") // hello world
    lambda2() // no parameters
    lambda3("hello", "world") // hello world
}

/**
 * 函数扩展: 扩展函数是静态分发的，它们不是以接受者类型为准的虚拟函数，而是由函数调用者所在的表达式的类型来决定的，
 * 而不是由表达式运行时求值结果来决定的。
 */
fun String.lastChar(): Char = get(length - 1)

// 利用函数扩展，Kotlin 也支持运算符重载
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

// No need for the open keyword here, it's already open by default
abstract class Animated {
    // the virtual function is already open by default
    abstract fun animate()

    // you can specify open keyword explicitly
    open fun stopAnimating() {}

    // not abstract method need to have default implementation
    fun animateTwice() {}
}

/**
 * 类别属性：
 * 用于声明类别的成员时：
 *  public: 全局可见，此为默认类型
 *  internal: 在当前模块中可见
 *  protected: 在当前类别的一级子类中可见，如果子类再被继承，则在下一级子类中不可见
 *  private: 在当前类别中可见
 * 用于顶层声明时：
 *  public: 全局可见，此为默认类型
 *  internal: 在当前模块中可见
 *  private: 在当前文件中可见
 */

// Class is visible ony to current module
internal open class TalkativeButton {
    // method is only visiable to current class
    private fun yell() {
        println("Hey!")
    }

    // method is visible to current class and derived classes
    protected fun whisper() = println("Let's talk!")
}

class User(var name: String) {
    // primary constructor generated
    // constructor(name: String) {
    //     this.name = name
    // }

    // secondary constructor custom define
    constructor(name: String, age: Int) : this(name) {
        println("$name is $age years old")
    }
}

// brew install kotlin

// immutable types, delegated properties, lazy initialization, string templates
val greeting by lazy {
    val doubleE1: String = "ll"
    "he${doubleE1}o"
    // initialized value: hello
}

// infix functions, extensions, type inference, nullable types, lambda expression,
// labeled this, elvis operator
infix fun String.andAnother(other: Any?) = buildString() {
    append(this@andAnother)
    append(" ")
    append(other ?: "")
}

// extensions, Unit
fun String.print() = println(this)

inline fun greet(s: () -> String): String = greeting andAnother s()

// inline fun greet(s: () -> String): String = greeting.andAnother(s())

// inline fun greet(s: () -> String): String {
//     return greeting.andAnother(s())
// }

inline fun greet(s: (String) -> String, name: String): String = greeting andAnother s(name)

// sealed class, companion objects
sealed class to {
    companion object {
        val place = "world"
    }
}

fun sayHello(maybe: String?, neverNull: Int) {
    val name = maybe ?: "stranger"
    println("Hello $name")
}

// 高阶函数
fun executeLambda(f: (name: String) -> Unit) {
    f("lambda")
}

// Lambdas 可用大括弧 { } 来定义，如果 lambda 带参数，可定义在大括弧内，并以 -> 运算符区隔
val lambda1 = { c: Any? -> println(c) }

val lambda2 = { println("no parameters") }

val lambda3 = { a: Any?, b: Any -> println("$a, $b") }