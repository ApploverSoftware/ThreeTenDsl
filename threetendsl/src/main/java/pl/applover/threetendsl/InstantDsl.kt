package pl.applover.threetendsl

import org.threeten.bp.LocalDate
import org.threeten.bp.LocalDateTime
import org.threeten.bp.LocalTime
import org.threeten.bp.Month

@Suppress("HasPlatformType")
internal object InstantDsl : Contract.DateTimeDsl {
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
