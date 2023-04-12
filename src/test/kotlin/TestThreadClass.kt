import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test

class TestThreadClass {

    @Test
    fun test1() {
        println("run thread...")

        ThreadClass1().start()

        println("wait...")
        runBlocking { delay(3000) }
        println("Ok")
    }

    @Test
    fun test2() {
        println("run thread...")

        ThreadClass2().run()

        println("wait...")
        runBlocking { delay(3000) }
        println("Ok")
    }

    @Test
    fun test3() {
        println("run thread...")

        ThreadClass3().start()

        println("wait...")
        runBlocking { delay(3000) }
        println("Ok")
    }

    @Test
    fun test4() {
        println("run thread...")

        ThreadClass4().start()

        println("wait...")
        runBlocking { delay(3000) }
        println("Ok")
    }
}
