import org.junit.Assert.assertThrows
import org.junit.Test

class TestExceptionClass {

    @Test
    fun testFooGood() {
        ExceptionClass().foo(20)
    }

    @Test
    fun testFooException1() {
        assertThrows(Exception::class.java) {
            ExceptionClass().foo(21)
        }
    }

    @Test (expected = Exception::class)
    fun testFooException2() {
            ExceptionClass().foo(21)
    }
}