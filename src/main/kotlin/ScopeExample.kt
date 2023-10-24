class ScopeExample {
    fun letTest() {
        val str = "Ответ на главный вопрос жизни и вселенной:"
        val result = str.let {
            print(it)
            it.length
        }
        println(" $result")
    }

    fun runTest() {
        val result = "Ответ на главный вопрос жизни и вселенной:".run {
            print(this)
            length
        }
        println(" $result")
    }

    fun withTest() {
        val str = "Ответ на главный вопрос жизни и вселенной:"
        with(str) {
            print(this)
            val length = length
            println(" $length")
        }
    }

    fun applyTest() {
        class Bar( var x : Int = 2,  var y : Int = 3) {
            fun print() {
                println("${x}x$y")
            }
        }

        val bar = Bar().apply {
            x = 10
            y = 12
        }
        bar.print()
    }

    fun alsoTest() {
        class Bar( var x : Int = 2,  var y : Int = 3) {
            fun print() {
                println("${x}x$y")
            }
        }
        val bar = Bar().also { bar2 ->
            bar2.x = 8
            bar2.y = 8
        }
        bar.print()
    }
}
