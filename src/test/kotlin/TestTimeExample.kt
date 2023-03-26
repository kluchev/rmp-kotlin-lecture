import org.junit.Test

class TestTimeExample {

    @Test
    fun test1() {
        val array1 : ArrayList<Long> = arrayListOf()
        val array2 : ArrayList<Long> = arrayListOf()

        repeat(10 ) {
            array1.add(TimeExample().testTime1())
            array2.add(TimeExample().testTime2())
        }

        repeat(10) {
            println("${array1[it]}, ${array2[it]}")
        }
    }
}
