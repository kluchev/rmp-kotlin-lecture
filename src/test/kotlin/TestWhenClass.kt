import org.junit.Test
import kotlin.test.assertEquals

class TestWhenClass {

    @Test
    fun testWhen1() {
        assertEquals( "foo", WhenClass().testWhen1(1))
        assertEquals( "bar", WhenClass().testWhen1(2))
        assertEquals( "baz", WhenClass().testWhen1(3))
    }

    @Test
    fun testWhen2() {
        assertEquals( "foobar", WhenClass().testWhen2(1))
        assertEquals( "foobar", WhenClass().testWhen2(2))
        assertEquals( "baz",    WhenClass().testWhen2(3))
    }

    @Test
    fun testWhen3() {
        assertEquals( "foo", WhenClass().testWhen3(1))
        assertEquals( "foo", WhenClass().testWhen3(2))
        assertEquals( "foo", WhenClass().testWhen3(3))
        assertEquals( "bar", WhenClass().testWhen3(4))
        assertEquals( "bar", WhenClass().testWhen3(5))
        assertEquals( "bar", WhenClass().testWhen3(6))
        assertEquals( "baz", WhenClass().testWhen3(7))
        assertEquals( "baz", WhenClass().testWhen3(8))
        assertEquals( "baz", WhenClass().testWhen3(9))
    }

    @Test
    fun testWhen4() {
        assertEquals( "foo", WhenClass().testWhen4(1))
        assertEquals( "bar", WhenClass().testWhen4(2))
        assertEquals( "baz", WhenClass().testWhen4(3))
    }

    @Test
    fun testWhen5() {
        assertEquals( "foo", WhenClass().testWhen5(1))
        assertEquals( "bar", WhenClass().testWhen5(2))
        assertEquals( "baz", WhenClass().testWhen5(3))
    }

    @Test
    fun testWhen6() {
        assertEquals( "foo", WhenClass().testWhen6(1))
        assertEquals( "bar", WhenClass().testWhen6(2))
        assertEquals( "baz", WhenClass().testWhen6(3))
    }
}