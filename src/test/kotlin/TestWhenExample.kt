import org.junit.Test
import kotlin.test.assertEquals

class TestWhenExample {

    @Test
    fun testWhen1() {
        assertEquals( "foo", WhenExample().testWhen1(1))
        assertEquals( "bar", WhenExample().testWhen1(2))
        assertEquals( "baz", WhenExample().testWhen1(3))
    }

    @Test
    fun testWhen2() {
        assertEquals( "foobar", WhenExample().testWhen2(1))
        assertEquals( "foobar", WhenExample().testWhen2(2))
        assertEquals( "baz",    WhenExample().testWhen2(3))
    }

    @Test
    fun testWhen3() {
        assertEquals( "foo", WhenExample().testWhen3(1))
        assertEquals( "foo", WhenExample().testWhen3(2))
        assertEquals( "foo", WhenExample().testWhen3(3))
        assertEquals( "bar", WhenExample().testWhen3(4))
        assertEquals( "bar", WhenExample().testWhen3(5))
        assertEquals( "bar", WhenExample().testWhen3(6))
        assertEquals( "baz", WhenExample().testWhen3(7))
        assertEquals( "baz", WhenExample().testWhen3(8))
        assertEquals( "baz", WhenExample().testWhen3(9))
    }

    @Test
    fun testWhen4() {
        assertEquals( "foo", WhenExample().testWhen4(1))
        assertEquals( "bar", WhenExample().testWhen4(2))
        assertEquals( "baz", WhenExample().testWhen4(3))
    }

    @Test
    fun testWhen5() {
        assertEquals( "foo", WhenExample().testWhen5(1))
        assertEquals( "bar", WhenExample().testWhen5(2))
        assertEquals( "baz", WhenExample().testWhen5(3))
    }

    @Test
    fun testWhen6() {
        assertEquals( "foo", WhenExample().testWhen6(1))
        assertEquals( "bar", WhenExample().testWhen6(2))
        assertEquals( "baz", WhenExample().testWhen6(3))
    }
}