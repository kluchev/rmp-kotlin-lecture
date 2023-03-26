import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test

class TestCoroutineClass {

    @Test
    fun testFoo() {
        println("run coroutine...")

        CoroutineClass().foo()

        println("wait...")
        runBlocking { delay(3000) }
        println("Ok")
    }

    @Test
    fun testBar() {
        println("run coroutine...")

        CoroutineClass().bar()

        println("wait...")
        runBlocking { delay(3000) }
        println("Ok")
    }
}