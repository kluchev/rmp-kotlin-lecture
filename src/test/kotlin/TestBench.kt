import org.junit.Test
import kotlin.system.measureNanoTime

class TestBench {

    @Test
    fun testSieveEratosthenes() {

        val bench = Benchmarks()
        var result : List<Int>? = listOf()

        repeat(10) {
            var dt: Long = 0
            dt = measureNanoTime {
                result = bench.getAllPrimesLessThan(1000)
            }
            println("dt = ${dt / 1000} mks")
        }
    }

    @Test
    fun testRedis5() {
        val r = Redis5()
        r.start()

        repeat(10) {
            var dt: Long = 0
            dt = measureNanoTime {
                r.start()
            }
            println("dt = ${dt / 1000} mks")
        }
    }
}
