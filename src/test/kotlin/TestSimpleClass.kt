import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestSimpleClass {
    var result : Int = 0

    @Test
    fun testSum1() {
        val simpleClass = SimpleClass()
        result = simpleClass.sum1(2,3)
        println(result)
        assertEquals(result, 5)
    }

    @Test
    fun testSum2() {
        val simpleClass = SimpleClass()
        result = simpleClass.sum2(2,3)
        println(result)
        assertEquals(result, 5)
    }
}