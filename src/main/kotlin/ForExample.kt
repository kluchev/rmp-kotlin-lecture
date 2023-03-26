class ForExample {

    fun testFor() {
        val array : ArrayList<String> = arrayListOf("foo", "bar", "baz")

        for(item in array) {
            println(item)
        }
    }

    fun testRepeatIt() {
        repeat(3) {
            println(it)
        }
    }

    fun testRepeatI() {
        repeat(3) { i ->
            println(i)
        }
    }
}
