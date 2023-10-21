import org.junit.Test
import kotlin.test.assertEquals

class TestInterface2Example {

    @Test
    fun testInterface2() {
        assertEquals(4, Calc().add(2,2))
        assertEquals(5, Calc().sub(6,1))
    }
}