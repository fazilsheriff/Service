package com.example.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onHandleIntent: "+Thread.currentThread().name.toString())

        btnStart.setOnClickListener{
            val intent= Intent(this,MyIntentSevicesA::class.java)
            startService(intent)

        }


        btnStop.setOnClickListener{
            val intent= Intent(this,MyIntentSevicesA::class.java)
            stopService(intent)
        }

    }
}