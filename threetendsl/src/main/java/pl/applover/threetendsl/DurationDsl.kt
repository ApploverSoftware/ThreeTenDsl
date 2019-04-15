package pl.applover.threetendsl

import org.threeten.bp.Duration
import org.threeten.bp.temporal.ChronoUnit
import org.threeten.bp.temporal.Temporal

@Suppress("HasPlatformType")
object DurationDsl : Contract.DurationDsl {
    override infix fun Temporal.till(future: Temporal) = Duration.between(this, future)
    override infix fun Temporal.since(past: Temporal) = Duration.between(past, this)
    override infix fun Long.years(months: Long) = years.plus(months, ChronoUnit.MONTHS)
    override infix fun Long.months(days: Long) = months.plusDays(days)
    override infix fun Duration.months(days: Long) = plusDays(days)
    override val Long.days: Duration
        get() = Duration.ofDays(this)
    override val Long.months: Duration
        get() = Duration.ZERO
                .plus(this, ChronoUnit.MONTHS)
    override val Long.years: Duration
        get() = Duration.ZERO
                .plus(this, ChronoUnit.YEARS)
}