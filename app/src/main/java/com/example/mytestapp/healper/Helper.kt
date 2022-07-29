package com.example.mytestapp.healper

object Helper {

    fun getText(num: Int): String {
        if (num >= 100)
            return "High"
        else
            return "Low"
    }
}