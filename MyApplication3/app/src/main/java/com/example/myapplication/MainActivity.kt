package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val rollButton:Button =findViewById(R.id.btn_roll)
        rollButton.setOnClickListener {
            rolledout()
        }
   

    }

    private fun rolledout() {
        val randomNum = (1..6).random()
        val randomView:TextView = findViewById(R.id.rand_view)
        randomView.text = randomNum.toString()

    }
}