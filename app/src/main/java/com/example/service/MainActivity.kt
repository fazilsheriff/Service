package com.example.service
///Todo:1 How to check service is running or not
///Todo:2 Life cycle of UnBounded Service
///Todo:3 Differencec between Stop servvice and stopSelf()
///Todo:4 What is exported and enabled

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStart.setOnClickListener{
            val intent= Intent(this,UnBoundedService::class.java)
            startService(intent)

        }


        btnStop.setOnClickListener{
            val intent= Intent(this,UnBoundedService::class.java)
            stopService(intent)
        }

    }
}