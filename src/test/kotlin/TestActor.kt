import kotlinx.coroutines.runBlocking
import org.junit.Test

class TestActor {

    @Test
    fun test1() {
        runBlocking {
            ActorExample.initCounter(5)

            println( ActorExample.read() )

            ActorExample.write("Hello #")

            println( ActorExample.read() )
            println( ActorExample.read() )
            println( ActorExample.read() )
            println( ActorExample.read() )
        }
    }
}
