import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.newSingleThreadContext

object ActorExample {
    private var lnk : SendChannel<LinkMsg>
    private val scope = CoroutineScope(newSingleThreadContext("TestActor"))

    sealed class LinkMsg
    private class InitCounter(val newValue: Int = 0) : LinkMsg()
    private class Write(val value: String) : LinkMsg()
    private class Read(val response: CompletableDeferred<String>) : LinkMsg()

    init {
        lnk = scope.linkActor()
    }

    suspend fun initCounter(newValue : Int = 0) = lnk.send(InitCounter(newValue))
    suspend fun write(value: String) = lnk.send(Write(value))
    suspend fun read(): String {
        val response = CompletableDeferred<String>()
        lnk.send(Read(response))
        return response.await()
    }

    fun CoroutineScope.linkActor() = actor<LinkMsg> {
        var str = ""
        var counter = 0

        for (msg in channel) {
            when (msg) {
                is InitCounter -> counter = msg.newValue
                is Write -> str = msg.value
                is Read -> {
                    val result = "${str}$counter"
                    msg.response.complete(result)
                    counter++
                }
            }
        }
    }
}
