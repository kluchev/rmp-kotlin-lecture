import java.util.*
import kotlin.collections.ArrayList

class Benchmarks {

    fun getAllPrimesLessThan(sieveSize: Int): List<Int>? {
        val sieve = BitSet(sieveSize)
        sieve.set(0, sieveSize - 1, true)
        sieve.set(0, false)
        sieve.set(1, false)
        run {
            var i = 2
            while (i * i < sieve.length()) {
                if (sieve.get(i)) {
                    var j = i * i
                    while (j < sieve.length()) {
                        sieve.set(j, false)
                        j += i
                    }
                }
                i++
            }
        }
        val primes: MutableList<Int> = ArrayList()
        for (i in 2 until sieve.length()) {
            if (sieve.get(i)) {
                primes.add(i)
            }
        }
        return primes
    }
}
