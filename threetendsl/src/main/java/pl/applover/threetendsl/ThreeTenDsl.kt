
package pl.applover.threetendsl

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import org.threeten.bp.*
import pl.applover.threetendsl.Contract.*

fun date(build: DateDsl.() -> LocalDate) = InstantDsl.build()
fun time(build: TimeDsl.() -> LocalTime) = InstantDsl.build()
fun dateTime(build: DateTimeDsl.() -> LocalDateTime) = InstantDsl.build()
fun dateOrNull(build: DateDsl.() -> LocalDate) = try {
    InstantDsl.build()
} catch (e: DateTimeException) {
    e.printStackTrace()
    null
}
fun timeOrNull(build: TimeDsl.() -> LocalTime) = try {
    InstantDsl.build()
} catch (e: DateTimeException) {
    e.printStackTrace()
    null
}
fun dateTimeOrNull(build: DateTimeDsl.() -> LocalDateTime) = try {
    InstantDsl.build()
} catch (e: DateTimeException) {
    e.printStackTrace()
    null
}

fun period(build: PeriodDsl.() -> Period) = PeriodDsl.build()
fun periodOrNull(build: PeriodDsl.() -> Period) = try {
    PeriodDsl.build()
} catch (e: DateTimeException) {
    e.printStackTrace()
    null
}

fun duration(build: DurationDsl.() -> Duration) = DurationDsl.build()
fun durationOrNull(build: DurationDsl.() -> Duration) = try {
    DurationDsl.build()
} catch (e: DateTimeException) {
    e.printStackTrace()
    null
}

fun Application.initThreeTenDsl() {
    AndroidThreeTen.init(this)
}