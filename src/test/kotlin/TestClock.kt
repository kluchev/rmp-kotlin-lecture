import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test

class ClockTest {
    @Test
    fun test1() {
        runBlocking {
            println( ClockExample().getDateTime() )
            delay(2000)
            println( ClockExample().getDateTime() )
        }
    }
}