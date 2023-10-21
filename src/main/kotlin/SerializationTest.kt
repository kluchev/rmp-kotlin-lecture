import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

@Serializable
data class TaskResult(
    var task : String = "",
    var errorCode : Int = -1,
    var errorMessage : String = "",
    var buf : String = "",
    //var info : HashMap<String, String> = hashMapOf()
) {

}
class SerializationTest {

    fun toJson() {
        val taskResult = TaskResult(
            "testTask", 12345,
            "test1",
            "test2",
            //hashMapOf("t1" to "x", "t2" to "y", "t3" to "z")
            )

        var dt : Long = 0
        var json  = ""
        dt = measureNanoTime {
            json = Json.encodeToString(taskResult)
        }
        println("dt = ${dt/1000} mks, json: $json")
    }
}