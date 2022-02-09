package com.example.playground03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import com.example.playground03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    // Initializes first screen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Starts Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Starts ViewModel
        val model: Model by viewModels()
        binding.textView.text = model.getCounterValue().toString()

        binding.floatingActionButton.setOnClickListener{buttonClicked(model)}
    }

    private fun setTextToCounter(model: Model) {
        binding.textView.text = model.getCounterValue().toString()
    }

    fun buttonClicked(model: Model) {
        model.addOne()
        setTextToCounter(model)
    }

}
