package com.example.service

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private  val TAG = "Threading"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartService = findViewById<Button>(R.id.btnstart)
        val btnStopService = findViewById<Button>(R.id.stopservice)

        btnStartService.setOnClickListener(){
            Log.i(TAG, "Inside the on 1: ")
            for(i in 1..10)
            {
                if(Thread.interrupted())
                {
                    Log.i(TAG, "Inside thread interuted!!")
                }
                showLog("Service is doing some thing!!"+i.toString())
                Thread.sleep(5000)
            }
        }

        btnStopService.setOnClickListener(){
            Log.i(TAG, "Inside the on 2: ")
            Thread.interrupted()

        }



    }

    private fun showLog(toString: String) {
        Log.i(TAG, "$toString")

    }
}