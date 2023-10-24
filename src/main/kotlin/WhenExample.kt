open class Msg
class MsgA() : Msg() {
    fun mA() : String { return "A" }
}
class MsgB : Msg() {
    fun mB() : String { return "B" }
}

class WhenExample {

    fun testWhen1(value: Int): String {
        var result = ""
        when (value) {
            1 -> result = "foo"
            2 -> result = "bar"
            3 -> result = "baz"
            else -> result = "?"
        }
        return result
    }

    fun testWhen2(value: Int): String {
        var result = ""
        when (value) {
            1, 2 -> result = "foobar"
            3 -> result = "baz"
            else -> result = "?"
        }
        return result
    }

    fun testWhen3(value: Int): String {
        var result = ""
        when (value) {
            in 1..3 -> result = "foo"
            in 4..6 -> result = "bar"
            in 7..9 -> result = "baz"
            else -> result = "?"
        }
        return result
    }

    fun testWhen4(value: Int): String {
        val result = when (value) {
            1 -> "foo"
            2 -> "bar"
            3 -> "baz"
            else -> "?"
        }
        return result
    }

    fun testWhen5(value: Int): String =
        when (value) {
            1 -> "foo"
            2 -> "bar"
            3 -> "baz"
            else -> "?"
        }

    fun testWhen6(value: Int): String = when (value) {
        1 -> "foo"; 2 -> "bar"; 3 -> "baz"; else -> "?"
    }

    fun testWhen7(msg : Msg) : String =
         when( msg ) {
            is MsgA -> msg.mA()
            is MsgB -> msg.mB()
            else -> "?"
        }

}
