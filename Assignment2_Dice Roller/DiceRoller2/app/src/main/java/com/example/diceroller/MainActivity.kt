package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice(){
        val dice = Dice(6)
        val cuberoll = dice.roll()
        val diceimage : ImageView = findViewById(R.id.imageView)

        val drawableresource = when(cuberoll)
        {
            1 -> R.drawable.img
            2 -> R.drawable.img_3
            3 -> R.drawable.img_4
            4 -> R.drawable.img_6
            5 -> R.drawable.img_2
            else ->  R.drawable.img_5
        }
        diceimage.setImageResource(drawableresource)
        val text = "You  rolled $cuberoll"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration) // in Activity
        toast.show()
    }
    class Dice(private val numSides : Int){
        fun roll():Int{
            return (1..numSides).random()
        }
    }
}