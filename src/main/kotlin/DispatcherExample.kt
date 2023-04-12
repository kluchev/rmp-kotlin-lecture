import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext

class DispatcherExample(val channel : Channel<Int>  ) {
    val context = newSingleThreadContext("test")

    fun start() {
        CoroutineScope(context).launch {
            println("Dispatcher start")

            while( true ) {
                when( channel.receive() ) {
                    0 -> phase1()
                    1 -> phase2()
                    2 -> phase3()
                    4 -> {
                        println("4. PROFIT!!!")
                        println("Dispatcher stop")
                        return@launch
                    }
                    else -> println("4. ???")
                }
            }
        }
    }

    fun phase1()= CoroutineScope(context).launch {
        println("1. Придумать требования")
        delay(1000)
        println("Требования придуманы")
    }
    fun phase2()= CoroutineScope(context).launch {
        println("2. Составить ТЗ")
        delay(1000)
        println("ТЗ составлено")
    }
    fun phase3()= CoroutineScope(context).launch {
        println("3. Разработать архитектуру")
        delay(1000)
        println("Архитектура разработана")
    }
}