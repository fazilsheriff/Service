package com.example.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent= Intent(this,FirstService::class.java)
        val intent2= Intent(this,SecondService::class.java)

        btnStart.setOnClickListener{
            startService(intent)
//            startService(intent2)
//            Thread.sleep(4000)
//            finish()

        }

        btnStop.setOnClickListener{
            stopService(intent)
        }
    }
}