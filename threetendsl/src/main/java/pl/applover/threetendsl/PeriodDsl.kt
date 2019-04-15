package pl.applover.threetendsl

import org.threeten.bp.LocalDate
import org.threeten.bp.Period

@Suppress("HasPlatformType")
object PeriodDsl : Contract.PeriodDsl {
    override infix fun LocalDate.till(future: LocalDate) = Period.between(this, future)
    override infix fun LocalDate.since(past: LocalDate) = Period.between(past, this)
    override infix fun Int.years(months: Int) = Period.ofYears(this).withMonths(months)
    override infix fun Int.months(days: Int) = Period.ofMonths(this).withDays(days)
    override infix fun Period.months(days: Int) = withDays(days)
    override val Int.days: Period
        get() = Period.ofDays(this)
    override val Int.months: Period
        get() = Period.ofMonths(this)
    override val Int.years: Period
        get() = Period.ofYears(this)
}