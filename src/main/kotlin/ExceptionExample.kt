class ExceptionExample {

    fun foo(a : Int) {
        if( a > 20 ) {
            throw Exception("Big bada boom!")
        }
    }

    fun bar() {
        try {
            foo( 21 )
        } catch (e : Exception) {
            println("ExceptionClass.bar(): exception -> ${e.message}")
            e.printStackTrace()
        }
    }

    fun baz() {

        runCatching {
            foo(21)
        }.onFailure {
            println("ExceptionClass.bar(): exception -> ${it.message}")
        }.onSuccess {
            println("Ok")
        }
    }
}
