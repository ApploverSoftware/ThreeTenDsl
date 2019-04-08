package pl.applover.threetendsldemo

import android.app.Application
import pl.applover.threetendsl.initThreeTenDsl

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        initThreeTenDsl()
    }
}