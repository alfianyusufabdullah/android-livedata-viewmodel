package com.alfianyusufabdullah.androidivedataviewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.graphics.Color
import java.util.*

class ColorViewModel : ViewModel() {

    val color = MutableLiveData<Int>()

    init {
        color.value = 0xfff
    }

    fun generateColor() {
        val rnd = Random()
        color.value = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
    }
}