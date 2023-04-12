import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test

class TestDispatcher {

    @Test
    fun test1() {
        val channel = Channel<Int>(100, onBufferOverflow = BufferOverflow.DROP_LATEST)

        val dispatcher = DispatcherExample(channel)

        runBlocking {
            dispatcher.start()

            delay(100)

            repeat(5) {
                channel.send(it)
                delay(10)
            }

            delay(4000)
        }
    }
}