import org.junit.Test

class TestCoroutinesVsTreads {

    @Test
    fun testCoroutine() {
        repeat(10) {
            CoroutinesVsTreads(100000000).coroutineTest()
            CoroutinesVsTreads(100000000).threadTest()
        }
    }

    @Test
    fun testCoroutine2() {
        var n = 1000

        repeat( 3 ) {
            repeat( 5 ) { CoroutinesVsTreads( n ).createCoroutines() }
            repeat( 5 ) { CoroutinesVsTreads(n).createThreads() }
            n *= 10
        }
    }
}
