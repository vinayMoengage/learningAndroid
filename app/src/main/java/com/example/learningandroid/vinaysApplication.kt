package com.example.learningandroid
import android.app.Application
import android.util.Log
import com.moengage.core.LogLevel
import com.moengage.core.MoEngage
import com.moengage.core.config.FcmConfig
import com.moengage.core.config.LogConfig

class vinaysApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Log.e("Testing", "Inside Application class method onCreate()")

        val moEngage = MoEngage.Builder(this, "T2I79ZWOB4MPWPYHF2CPYQ36")
            .configureLogs(LogConfig(LogLevel.VERBOSE, true))
            .build()
        MoEngage.initialise(moEngage)
    }
}