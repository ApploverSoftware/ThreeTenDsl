package pl.applover.threetendsl

import org.threeten.bp.Duration
import org.threeten.bp.temporal.ChronoUnit
import org.threeten.bp.temporal.Temporal

@Suppress("HasPlatformType")
object DurationDsl : Contract.DurationDsl {
    override infix fun Temporal.till(future: Temporal) = Duration.between(this, future)
    override infix fun Temporal.since(past: Temporal) = Duration.between(past, this)

    override infix fun Long.years(months: Long) = years.plus(months.months)
    override infix fun Long.months(days: Long) = months.plusDays(days)
    override infix fun Duration.months(days: Long) = plusDays(days)
    override infix fun Long.days(hours: Long)= Duration.ofDays(this).plusHours(hours)
    override infix fun Duration.days(hours: Long) = plusHours(hours)
    override infix fun Long.h(minutes: Long) = Duration.ofHours(this).plusMinutes(minutes)
    override infix fun Duration.h(minutes: Long)=plusMinutes(minutes)
    override infix fun Long.m(seconds: Long)= Duration.ofMinutes(this).plusSeconds(seconds)
    override infix fun Duration.m(seconds: Long)=plusSeconds(seconds)

    override val Long.s: Duration
        get() = Duration.ofSeconds(this)
    override val Long.m: Duration
        get() = Duration.ofMinutes(this)
    override val Long.h: Duration
        get() = Duration.ofHours(this)
    override val Long.days: Duration
        get() = Duration.ofDays(this)
    override val Long.months: Duration
        get() = Duration.ZERO
                .plus(this, ChronoUnit.MONTHS)
    override val Long.years: Duration
        get() = Duration.ZERO
                .plus(this, ChronoUnit.YEARS)

    override infix fun Int.years(months: Int) = years.plus(months.months)
    override infix fun Int.months(days: Int) = months.plusDays(days.toLong())
    override infix fun Duration.months(days: Int) = plusDays(days.toLong())
    override infix fun Int.days(hours: Int)= Duration.ofDays(toLong()).plusHours(hours.toLong())
    override infix fun Duration.days(hours: Int) = plusHours(hours.toLong())
    override infix fun Int.h(minutes: Int) = Duration.ofHours(toLong()).plusMinutes(minutes.toLong())
    override infix fun Duration.h(minutes: Int)=plusMinutes(minutes.toLong())
    override infix fun Int.m(seconds: Int)= Duration.ofMinutes(toLong()).plusSeconds(seconds.toLong())
    override infix fun Duration.m(seconds: Int)=plusSeconds(seconds.toLong())

    override val Int.s: Duration
        get() = Duration.ofSeconds(toLong())
    override val Int.m: Duration
        get() = Duration.ofMinutes(toLong())
    override val Int.h: Duration
        get() = Duration.ofHours(toLong())
    override val Int.days: Duration
        get() = Duration.ofDays(toLong())
    override val Int.months: Duration
        get() = Duration.ZERO
                .plus(toLong(), ChronoUnit.MONTHS)
    override val Int.years: Duration
        get() = Duration.ZERO
                .plus(toLong(), ChronoUnit.YEARS)
}