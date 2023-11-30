import org.junit.Test

class TestDelegate {
    @Test
    fun test1() {
        DelegateExample().test1()

        val x = DelegateExample().sub(100,1)
        val y = DelegateExample().sum(40,2)
        val z = DelegateExample().mul(2,3)
        println("$x, $y, $z")
    }
}
