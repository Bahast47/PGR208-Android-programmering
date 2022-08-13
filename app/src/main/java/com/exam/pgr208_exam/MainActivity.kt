package com.exam.pgr208_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.exam.pgr208_exam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}