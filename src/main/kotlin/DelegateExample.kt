interface BaseA {
    fun sum(a : Int, b : Int) : Int = a + b
}

interface BaseB {
    fun sub (a : Int, b : Int) : Int = a - b
    fun mul(a : Int, b : Int) : Int
}

class BaseAImpl() : BaseA
class BaseBImpl() : BaseB {
    override fun mul(a : Int, b : Int) : Int = throw Exception("Еще не готово!")
}

class DelegateExample(
    private val a : BaseAImpl = BaseAImpl(),
    private val b : BaseBImpl = BaseBImpl()) :
    BaseA by a,  BaseB by b {

    override fun mul(a: Int, b: Int): Int = a*b

    fun test1() {
        val x = sum(2,2)
        val y = sub(6,2)
        println("$x, $y")
    }
}


