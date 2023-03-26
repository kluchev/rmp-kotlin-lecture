import org.junit.Assert.assertThrows
import org.junit.Test

class TestExceptionExample {

    @Test
    fun testFooGood() {
        ExceptionExample().foo(20)
    }

    @Test
    fun testFooException1() {
        assertThrows(Exception::class.java) {
            ExceptionExample().foo(21)
        }
    }

    @Test (expected = Exception::class)
    fun testFooException2() {
            ExceptionExample().foo(21)
    }
}