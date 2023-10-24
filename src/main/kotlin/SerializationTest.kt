import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.system.measureNanoTime

@Serializable
data class TaskResult(
    var task : String = "",
    var errorCode : Int = -1,
    var errorMessage : String = "",
    var buf : String = "",
)
class SerializationTest {
    fun toJson() {
        val taskResult = TaskResult(
            "testTask", 12345,
            "test1",
            "test2"
            )
        var dt : Long = 0
        var json  = ""
        dt = measureNanoTime {
            json = Json.encodeToString(taskResult)
        }
        println("dt = ${dt/1000} mks, json: $json")
    }
}
