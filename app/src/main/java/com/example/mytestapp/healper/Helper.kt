package com.example.mytestapp.healper

object Helper {

    /**
     * Check if the given number is high
     * or low.
     */
    fun getText(num: Int): String {
        if (num >= 100)
            return "High"
        else
            return "Low"
    }
}