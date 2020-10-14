package com.example.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service() {
    private  val TAG = "MyService"

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(TAG, "In Service class: Displays the current thread id "+Thread.currentThread().name.toString())

            for(i in 1..10)
            {
                Thread.sleep(10)
                showLog("Service is doing some thing!!"+i.toString())
            }
        return super.onStartCommand(intent, flags, startId)
    }

    fun showLog(MSG:String)
    {
        Log.i(TAG, MSG)
    }
}
