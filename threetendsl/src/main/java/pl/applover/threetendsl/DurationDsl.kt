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
    override fun Long.days(hours: Long)= Duration.ofDays(this).plusHours(hours)
    override fun Duration.days(hours: Long) = plusHours(hours)
    override fun Long.h(minutes: Long) = Duration.ofHours(this).plusMinutes(minutes)
    override fun Duration.h(minutes: Long)=plusMinutes(minutes)
    override fun Long.m(seconds: Long)= Duration.ofMinutes(this).plusSeconds(seconds)
    override fun Duration.m(seconds: Long)=plusSeconds(seconds)

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
}