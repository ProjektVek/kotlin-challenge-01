package com.example.playground03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.playground03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding
    var counter = 0

    // Initializes first screen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setCounterToZero()
        binding.floatingActionButton.setOnClickListener{addOne()}

    }

    private fun setTextToCounter() {
        binding.textView.text = "" + counter
    }

    fun setCounterToZero() {
        counter = 0
        setTextToCounter()
    }

    fun addOne() {
        counter++
        setTextToCounter()
    }

}