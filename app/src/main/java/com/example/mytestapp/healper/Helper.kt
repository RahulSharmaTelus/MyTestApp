package com.example.mytestapp.healper

object Helper {
    var value: Int = 10

    /**
     * Check if the given number is high
     * or low.
     */
    fun getText(num: Int): String {
        value = num
        if (num >= 100)
            return "High"
        else
            return "Low"
    }
}