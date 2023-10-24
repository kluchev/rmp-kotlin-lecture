class AnyExample {

    fun start() {
        val foo: Any = "Смысл жизни и всего такого"
        val bar: Any = 42
        val baz: Any? = null

        val size : Int = (foo as String).length
        println("size = $size")

        if( foo is String ) {
            println("foo - String")
        }

        val yInt : Int = bar as Int
        println("Смысл жизни = $yInt")

        if( baz == null ) {
            println("baz -  null")
        }

    }
}