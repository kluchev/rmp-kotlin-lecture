import kotlinx.coroutines.*

class CoroutineExample {

    fun foo() {
        val context = newSingleThreadContext("test")

        CoroutineScope(context).launch {
            repeat(10 ) {
                println("${Thread.currentThread()}  run  #$it")
                delay(50)
            }
        }
    }

    fun bar() {
        val context = newFixedThreadPoolContext(2, "test2")

        CoroutineScope(context).launch {
            repeat(10 ) {
                println("${Thread.currentThread()}  run  #$it")
                delay(50)
            }
        }
    }
}
