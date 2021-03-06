import test.*

class A {

    private fun method() = "O"

    private val prop = "K"

    fun test1(): String {
        return call {
            method() + prop
        }
    }

    fun test2(): String {
        return call {
            call {
                method() + prop
            }
        }
    }
}

fun box(): String {
    val a = A()
    if (a.test1() != "OK") return "fail 1: ${a.test1()}"
    return a.test2()
}