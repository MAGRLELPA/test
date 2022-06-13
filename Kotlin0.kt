import java.util.spi.AbstractResourceBundleProvider
import kotlin.contracts.contract

class Kotlin0 {
}

fun main() {
    val i = 42
    val s = "全ての答え：$i"
    val s1 = "1 + 1 = ${1 + 1}"
    val s2 = "s1's length = s1.length"
    println(s)
    println(s1)
    println(s2)

    var num : Int = 2
    num = 3
    println(num)

    if(true) {
        println("true")
    }
    val result : String = if(true) {
        "true!"
    } else {
        "false!"
    }
    println(result)

    val value = 1
    val str = when(value) {
        1 -> "one"
        2 -> "two"
        else -> "other"
    }
    println(str)

    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5, )
    for (i in array) {
        println(i)
    }
    for(i in 8 downTo 0 step 2) {
        println(i)
    }
    for (i in 0..4) {
        println(i)
    }

    var count = 0
    while  (count < 10) {
        println(count++)
    }

    var b : String? = "abc"
    b = null
    println(b)
    val c : Int? = b?.length
    println(c)
    val d : Int = b?.length ?: -1
    println(d)

    fun add(x : Int, y : Int): Int {
        return x + y
    }
    println(add(1, 100))

    fun toAddFormula(v: Int,  n: Int = 1): String {
        return  "$v + $n"
    }
    println(toAddFormula(10))
    println(toAddFormula(3 ,10))
    println(toAddFormula(n = 3, v = 4))

    fun displayName(first: String, last: String, middle: String = "") : String {
        return "$first $middle $last"
    }
    println(displayName("ことり", "ん", "K"))
    println(displayName(first = "kot", last = "lin"))
    Person("kotlin")
    var person = Person("kotlin", "Kotlin")
    println(person.age)
    person.age = 10
    person.message = "hey"
    println(person.age)
    println(person.message)

    val greeter = Greeter()
    greeter.greet("Kotlin")

    SingletonClass.staticMethod()

    Myclass.staticMethod()
    println(Myclass.staticMember)
    val ins = Myclass()
    ins.instanceMethod()
    println(ins.instanceMember)

}

class Person(name: String) {
    init {
        println("name = $name")
    }
    constructor(name: String, parent: String) : this(name) {
        println("parent = $parent")
    }
    var age: Int = 0
    lateinit var message: String
}

class Greeter {
    fun greet(name: String) {
        println("Hello, $name!")
    }
}

object SingletonClass {
    fun staticMethod() {
        println("singleton")
    }
}

class Myclass {
    companion object {
        var staticMember: Int = 1
        fun staticMethod() {
            println("static")
        }
    }
    val instanceMember: Int = 3
    fun instanceMethod(){
        println("instance")
    }

}