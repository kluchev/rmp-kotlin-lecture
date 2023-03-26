open class A() {
    fun a() {
        println("a")
    }
}

open class B() : A() {
    fun b() {
        println("b")
    }
}

class InheritanceExample : B() {
    fun c() {
        a()
        b()
        println("c")
    }
}
