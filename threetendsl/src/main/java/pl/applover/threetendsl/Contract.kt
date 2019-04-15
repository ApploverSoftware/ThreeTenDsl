package pl.applover.threetendsl

import org.threeten.bp.*
import org.threeten.bp.temporal.Temporal

@Suppress("FunctionName")
interface Contract {
    interface TimeDsl {
        infix fun LocalTime.m(s: Int): LocalTime
        infix fun Int.h(m: Int): LocalTime
    }

    interface DateDsl {
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

    interface DateTimeDsl : TimeDsl, DateDsl {
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

    interface PeriodDsl {
        infix fun LocalDate.till(future: LocalDate): Period
        infix fun LocalDate.since(past: LocalDate): Period
        infix fun Int.years(months: Int): Period
        infix fun Int.months(days: Int): Period
        infix fun Period.months(days: Int): Period
        val Int.days: Period
        val Int.months: Period
        val Int.years: Period
    }

    interface DurationDsl {
        infix fun Temporal.till(future: Temporal): Duration
        infix fun Temporal.since(past: Temporal): Duration
        infix fun Long.years(months: Long): Duration
        infix fun Long.months(days: Long): Duration
        infix fun Duration.months(days: Long): Duration
        infix fun Long.days(hours: Long): Duration
        infix fun Duration.days(hours: Long): Duration
        infix fun Long.h(minutes: Long): Duration
        infix fun Duration.h(minutes: Long): Duration
        infix fun Long.m(seconds: Long): Duration
        infix fun Duration.m(seconds: Long): Duration
        val Long.s: Duration
        val Long.m: Duration
        val Long.h: Duration
        val Long.days: Duration
        val Long.months: Duration
        val Long.years: Duration

        infix fun Int.years(months: Int): Duration
        infix fun Int.months(days: Int): Duration
        infix fun Duration.months(days: Int): Duration
        infix fun Int.days(hours: Int): Duration
        infix fun Duration.days(hours: Int): Duration
        infix fun Int.h(minutes: Int): Duration
        infix fun Duration.h(minutes: Int): Duration
        infix fun Int.m(seconds: Int): Duration
        infix fun Duration.m(seconds: Int): Duration
        val Int.s: Duration
        val Int.m: Duration
        val Int.h: Duration
        val Int.days: Duration
        val Int.months: Duration
        val Int.years: Duration
    }
}