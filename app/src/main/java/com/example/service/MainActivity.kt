package com.example.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private  val TAG = "MyService"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "In main activity: Displays the current thread id "+Thread.currentThread().name)
        Thread({
// call runnable here
            Log.i(TAG, "Inside Thread: Displays the current thread id "+Thread.currentThread().name)

//            println("running from lambda: ${Thread.currentThread().name}")
            val intent= Intent (this,MyService::class.java)
            startService(intent)
        }).start()

    }
}