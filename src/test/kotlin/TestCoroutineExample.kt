import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test

class TestCoroutineExample {

    @Test
    fun testFoo() {
        println("run coroutine...")

        CoroutineExample().foo()

        println("wait...")
        runBlocking { delay(3000) }
        println("Ok")
    }

    @Test
    fun testBar() {
        println("run coroutine...")

        CoroutineExample().bar()

        println("wait...")
        runBlocking { delay(3000) }
        println("Ok")
    }
}