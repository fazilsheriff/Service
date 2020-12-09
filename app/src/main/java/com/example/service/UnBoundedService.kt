package com.example.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class UnBoundedService : Service() {
    private  val TAG = "UnBoundedService"
    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "onCreate: ")
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
        Log.i(TAG, "onBind: ")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(TAG, "onStartCommand: ")

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onRebind(intent: Intent?) {
        Log.i(TAG, "onRebind: ")

        super.onRebind(intent)
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.i(TAG, "onUnbind: ")

        return super.onUnbind(intent)
    }

    override fun onStart(intent: Intent?, startId: Int) {
        super.onStart(intent, startId)
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy: ")

        super.onDestroy()
    }
}