package pl.applover.threetendsldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.applover.threetendsl.*

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
    }

}
