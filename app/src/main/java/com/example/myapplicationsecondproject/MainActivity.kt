package com.example.myapplicationsecondproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationsecondproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}