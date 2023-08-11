package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val dieSides = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // identifying UI components without View Binding
        val diceTextView = findViewById<TextView>(R.id.diceTextView)
        val rollDiceButton = findViewById<Button>(R.id.rollDiceButton)

        rollDiceButton.setOnClickListener {
            diceTextView.text = Die(dieSides).roll().toString()
        }
    }
}

class Die(private var sides: Int = 6){
    fun roll() = (1..sides).random()
}