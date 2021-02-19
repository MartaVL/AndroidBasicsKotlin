package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows to user to roll a die and view the result
 * on screen
 * **/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButon: Button = findViewById(R.id.button)
        rollButon.setOnClickListener { rollDice() }

        // Do a dice roll when the app starts
        rollDice()
    }

    /**
     * Roll the dice and update the screen with result.
     */
    private fun rollDice() {
        // Create a new Dice object with 6 sides
        val dice = Dice(6)
        val roll = dice.roll()

        // Find the ImageView in the layout to show a roll dice
        val diceImage : ImageView = findViewById(R.id.imageView2)

        // Determine which drawable resource ID to use based on the dice roll
        val idResourceResult = when (roll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(idResourceResult)

        // Update the content description
        diceImage.contentDescription = roll.toString()
    }
}