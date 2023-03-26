import org.junit.Test
import kotlin.test.assertEquals

class TestInterfaceExample {

    @Test
    fun testSub() {
        assertEquals(5,  InterfaceExample1().calc(Sub(), 6, 1) )
        assertEquals(5,  InterfaceExample2().calc(Sub(), 6, 1) )
    }

    @Test
    fun testAdd() {
        assertEquals(3,  InterfaceExample1().calc(Add(), 2, 1) )
        assertEquals(3,  InterfaceExample2().calc(Add(), 2, 1) )
    }
}
