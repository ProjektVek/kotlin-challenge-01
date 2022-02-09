package com.example.playground03

import androidx.lifecycle.ViewModel

class Model : ViewModel() {

    var counter = 0

    fun setCounterToZero() {
        counter = 0
    }

    fun addOne() {
        counter++
    }

    fun getCounterValue() : Int {
        return counter
    }
}