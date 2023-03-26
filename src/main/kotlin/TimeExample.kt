import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

inline fun deltaTime(block: () -> Unit) : Long {
    val start = System.currentTimeMillis()
    block()
    return (System.currentTimeMillis() - start)
}


class TimeExample {

    fun testTime1() : Long {
        var result : Long
        runBlocking {
            result = deltaTime {
                delay(100)
            }
        }

        return result
    }

    fun testTime2() : Long {
        var result : Long
        runBlocking {
            result = measureTimeMillis {
                delay(100)
            }
        }

        return result
    }
}