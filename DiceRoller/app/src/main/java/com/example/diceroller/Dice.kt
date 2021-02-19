package com.example.diceroller

/**
 * This class define a dice with a variable number of side
 */

public class Dice(private val numSides: Int) {

    /**
     * This function allows get a number random beetwen 1 and number of side
     */
    public fun roll(): Int {
        return (1..numSides).random()
    }
}