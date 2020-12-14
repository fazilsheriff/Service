package com.example.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class LifeCycleService: Service() {
    private  val TAG = "LifeCycleService"
    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "OnCreate()")

    }
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(TAG, " onStartCommand In Service class: Displays the current thread id "+Thread.currentThread().name.toString())

//        for(i in 1..13)
//        {
//            Thread.sleep(1000)
//            showLog("Service is doing some thing!!"+i.toString())
//        }
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: Serivce is Destoryed")
    }
    fun showLog(MSG:String)
    {
        Log.i(TAG, MSG)
    }
}