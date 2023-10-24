import java.time.*
import java.time.format.DateTimeFormatter

class ClockExample {
    private val patternTimestamp = "dd.MM.yyyy HH:mm:ss"

    private fun getInstantNow() : Instant {
        return Clock.systemDefaultZone().instant()
    }

    private fun getLocalFormattedTs(instant : Instant) : String {
        val ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault())
        return DateTimeFormatter.ofPattern(patternTimestamp).format(ldt)
    }

    fun getDateTime() : String = getLocalFormattedTs( getInstantNow() )
}

