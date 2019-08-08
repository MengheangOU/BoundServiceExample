package com.example.boundserviceexample

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import java.util.*

class SreySa : Service() {

    inner class TevyBinder:Binder(){
        fun getSreysaObject():SreySa{
            return this@SreySa
        }
    }

    var tevyBinder:Binder = TevyBinder()
    override fun onBind(intent: Intent): IBinder {
         return tevyBinder
    }

    fun getBread():String{
        return "Bread"
    }

    fun getTime():String{
        return Date().toString()
    }
}
