package pl.applover.threetendsldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.threeten.bp.Period
import pl.applover.threetendsl.*
import java.time.Duration

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        date { 14 September 2019 }.apply(::println)
        time { 15 h 40 m 12 }.apply(::println)
        dateTime { 8 h 0 m 0 on 12 October 1950 }.apply(::println)
        dateTime { 31 January 2000 at 12 h 40 m 59 }.apply(::println)

        timeOrNull { 16 h 40 }?.let {
            dateTime { it on date { 2 December 1990 } }.apply(::println)
        }

        dateTimeOrNull { date { 1 April 2015 } at time { 4 h 79 m 50 } }?.apply {
            println(this.nano)
        }

        period { date { 1 April 2010 } till date { 2 April 2010 } }
        period { date { 2 April 2010 } since date { 1 April 2010 } }

        duration { time { 15 h 40 } till time { 16 h 50 } }
        duration { time { 16 h 50 } since time { 15 h 40 } }

        period { 12 years 0 months 0}
        period { 12 years 0 }
        period { 5 months 0 }

        period { 5.years }
        period { 3.months }
        period { 2.days }

        duration { 12 h 40 m 20 }
        duration { 40 m 20 }
        duration { 2 days 12 h 40 }
        duration { 1 years 0 months 0 days 12 h 40 m 20 }
        duration { 1 years 0 months 0 }


    }

}
