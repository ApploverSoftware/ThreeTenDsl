@file:Suppress("FunctionName")

package pl.applover.threetendsl

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import org.threeten.bp.*

@Suppress("HasPlatformType")
internal object ThreeTenDsl : DateTimeDslContract {
    //TimeDSL

    override infix fun LocalTime.m(s: Int) = withSecond(s)
    override infix fun Int.h(m: Int) = LocalTime.of(this, m)

    //DateDSL

    override infix fun Int.January(year: Int) = LocalDate.of(year, Month.JANUARY, this)
    override infix fun Int.February(year: Int) = LocalDate.of(year, Month.FEBRUARY, this)
    override infix fun Int.March(year: Int) = LocalDate.of(year, Month.MARCH, this)
    override infix fun Int.April(year: Int) = LocalDate.of(year, Month.APRIL, this)
    override infix fun Int.May(year: Int) = LocalDate.of(year, Month.MAY, this)
    override infix fun Int.June(year: Int) = LocalDate.of(year, Month.JUNE, this)
    override infix fun Int.July(year: Int) = LocalDate.of(year, Month.JULY, this)
    override infix fun Int.August(year: Int) = LocalDate.of(year, Month.AUGUST, this)
    override infix fun Int.September(year: Int) = LocalDate.of(year, Month.SEPTEMBER, this)
    override infix fun Int.October(year: Int) = LocalDate.of(year, Month.OCTOBER, this)
    override infix fun Int.November(year: Int) = LocalDate.of(year, Month.NOVEMBER, this)
    override infix fun Int.December(year: Int) = LocalDate.of(year, Month.DECEMBER, this)

    //DateTimeDSL

    override infix fun LocalDateTime.h(m: Int) = withMinute(m)
    override infix fun LocalDateTime.m(s: Int) = withSecond(s)
    override infix fun LocalDate.at(t: LocalTime) = LocalDateTime.of(this, t)
    override infix fun LocalDate.at(h: Int) = LocalDateTime.of(this, h h 0)
    override infix fun LocalTime.on(d: Int) = LocalDateTime.of(LocalDate.of(1971, 1, d), this)
    override infix fun LocalTime.on(d: LocalDate) = LocalDateTime.of(d, this)
    override infix fun LocalDateTime.January(year: Int) = withYear(year).withMonth(Month.JANUARY.value)
    override infix fun LocalDateTime.February(year: Int) = withYear(year).withMonth(Month.FEBRUARY.value)
    override infix fun LocalDateTime.March(year: Int) = withYear(year).withMonth(Month.MARCH.value)
    override infix fun LocalDateTime.April(year: Int) = withYear(year).withMonth(Month.APRIL.value)
    override infix fun LocalDateTime.May(year: Int) = withYear(year).withMonth(Month.MAY.value)
    override infix fun LocalDateTime.June(year: Int) = withYear(year).withMonth(Month.JUNE.value)
    override infix fun LocalDateTime.July(year: Int) = withYear(year).withMonth(Month.JULY.value)
    override infix fun LocalDateTime.August(year: Int) = withYear(year).withMonth(Month.AUGUST.value)
    override infix fun LocalDateTime.September(year: Int) = withYear(year).withMonth(Month.SEPTEMBER.value)
    override infix fun LocalDateTime.October(year: Int) = withYear(year).withMonth(Month.OCTOBER.value)
    override infix fun LocalDateTime.November(year: Int) = withYear(year).withMonth(Month.NOVEMBER.value)
    override infix fun LocalDateTime.December(year: Int) = withYear(year).withMonth(Month.DECEMBER.value)
}


fun date(build: DateDslContract.() -> LocalDate) = ThreeTenDsl.build()
fun time(build: TimeDslContract.() -> LocalTime) = ThreeTenDsl.build()
fun dateTime(build: DateTimeDslContract.() -> LocalDateTime) = ThreeTenDsl.build()

fun dateOrNull(build: DateDslContract.() -> LocalDate) = try {
    ThreeTenDsl.build()
} catch (e: DateTimeException) {
    e.printStackTrace()
    null
}

fun timeOrNull(build: TimeDslContract.() -> LocalTime) = try {
    ThreeTenDsl.build()
} catch (e: DateTimeException) {
    e.printStackTrace()
    null
}

fun dateTimeOrNull(build: DateTimeDslContract.() -> LocalDateTime) = try {
    ThreeTenDsl.build()
} catch (e: DateTimeException) {
    e.printStackTrace()
    null
}

fun Application.initThreeTenDsl() {
    AndroidThreeTen.init(this)
}

interface TimeDslContract {
    infix fun LocalTime.m(s: Int): LocalTime
    infix fun Int.h(m: Int): LocalTime
}

interface DateDslContract {
    infix fun Int.January(year: Int): LocalDate
    infix fun Int.February(year: Int): LocalDate
    infix fun Int.March(year: Int): LocalDate
    infix fun Int.April(year: Int): LocalDate
    infix fun Int.May(year: Int): LocalDate
    infix fun Int.June(year: Int): LocalDate
    infix fun Int.July(year: Int): LocalDate
    infix fun Int.August(year: Int): LocalDate
    infix fun Int.September(year: Int): LocalDate
    infix fun Int.October(year: Int): LocalDate
    infix fun Int.November(year: Int): LocalDate
    infix fun Int.December(year: Int): LocalDate
}

interface DateTimeDslContract : TimeDslContract, DateDslContract {
    infix fun LocalDateTime.h(m: Int): LocalDateTime
    infix fun LocalDateTime.m(s: Int): LocalDateTime
    infix fun LocalDate.at(t: LocalTime): LocalDateTime
    infix fun LocalDate.at(h: Int): LocalDateTime
    infix fun LocalTime.on(d: Int): LocalDateTime
    infix fun LocalTime.on(d: LocalDate): LocalDateTime
    infix fun LocalDateTime.May(year: Int): LocalDateTime
    infix fun LocalDateTime.January(year: Int): LocalDateTime
    infix fun LocalDateTime.February(year: Int): LocalDateTime
    infix fun LocalDateTime.March(year: Int): LocalDateTime
    infix fun LocalDateTime.April(year: Int): LocalDateTime
    infix fun LocalDateTime.June(year: Int): LocalDateTime
    infix fun LocalDateTime.July(year: Int): LocalDateTime
    infix fun LocalDateTime.August(year: Int): LocalDateTime
    infix fun LocalDateTime.September(year: Int): LocalDateTime
    infix fun LocalDateTime.October(year: Int): LocalDateTime
    infix fun LocalDateTime.November(year: Int): LocalDateTime
    infix fun LocalDateTime.December(year: Int): LocalDateTime
}