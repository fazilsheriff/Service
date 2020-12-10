package com.example.service

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentSevicesA:IntentService("Intent Service") {

    private  val TAG = "MyIntentSevicesA"

    override fun onHandleIntent(p0: Intent?) {
        Log.i(TAG, "onHandleIntent: "+Thread.currentThread().name.toString())

        for(i in 1..13)
        {
            Thread.sleep(1000)
            showLog("Service is doing some thing!!"+i.toString())
        }
    }

    fun showLog(MSG:String)
    {
        Log.i(TAG, MSG)
    }
}