package com.alfianyusufabdullah.androidivedataviewmodel

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorGeneratorViewModel = ViewModelProviders.of(this).get(ColorViewModel::class.java)
        colorGeneratorViewModel.color.observe(this, Observer<Int> { t ->
            t?.let {
                rootView.setBackgroundColor(it)
                btnChangeColor.text = it.toString()
            }
        })

        btnChangeColor.setOnClickListener {
            colorGeneratorViewModel.generateColor()
        }
    }
}
