import org.junit.Test

class TestSerialization {

    @Test
    fun test1() {
        val st = SerializationTest()
        repeat( 10 ) {
            st.toJson()
        }

    }
}