package com.allykh.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.allykh.assignment4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
    }
}