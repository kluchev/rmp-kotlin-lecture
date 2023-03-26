import kotlinx.coroutines.*
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

class CoroutinesVsTreads(var n : Int = 10000) {
    private var a : Int = 1
    private var b : Int = 1
    private var c : Int = 1
    private val context = newSingleThreadContext("test")
    private var counter : AtomicInteger = AtomicInteger(0)
    private val channel = Channel<Int>(1, onBufferOverflow = BufferOverflow.DROP_LATEST)

    private fun calculate(n : Int) {
        repeat(n) {
            c += ((a + b) * 2)
        }
    }

    fun coroutineTest() {
        var dt : Long = 0

        runBlocking {
            dt = measureTimeMillis {
                val job = CoroutineScope(context).launch {
                    calculate(n)
                }

                job.join()
            }
        }

        println("coroutine dt = $dt ms")
    }


    fun threadTest() {

        val dt = measureTimeMillis {
            val thread = Thread {
                calculate( n )
            }

            thread.start()
            thread.join()
        }

        println("thread     dt = $dt ms")
    }

    fun createCoroutines() {
        counter.set(0)

        val dt = measureTimeMillis {
            repeat(n) {
                CoroutineScope(context).launch {
                    val i = it
                    delay(100)
                    counter.incrementAndGet()
                    if (i >= (n - 1)) {
                        runBlocking {
                            channel.send(1)
                        }
                    }
                }
            }

            runBlocking {
                channel.receive()
            }
        }

        println("coroutines: n = $n,  counter = ${counter.get()}, dt = $dt")
    }

    fun createThreads() {
        counter.set(0)

        val dt = measureTimeMillis {
            repeat(n) {
                Thread {
                    val i = it
                    Thread.sleep(100)
                    counter.incrementAndGet()
                    if (i >= (n - 1)) {
                        runBlocking {
                            channel.send(1)
                        }
                    }
                }.start()
            }

            runBlocking {
                channel.receive()
            }
        }
        println("threads: n = $n,  counter = ${counter.get()}, dt = $dt")
    }
}