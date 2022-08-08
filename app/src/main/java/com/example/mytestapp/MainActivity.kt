package com.example.mytestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Calculate sum of the two numbers
     *
     * @first first number integer
     * @second second number integer
     *
     * @return return sum integer
     */
    fun sum(first: Int,second: Int) : Int {
        return first + second
    }

    fun subtract(first: Int,second: Int) : Int {
        return first - second
    }

    fun multiply(first: Int,second: Int) : Int {
        return first * second
    }

    fun divide(first: Int,second: Int) : Int {
        return first / second
    }

    /**
     * Check if the given number is prime or not
     */
    fun isPrime(num: Int) : Boolean {
        var flag = true
        for (i in 2..num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = false
                break
            }
        }
        return flag
    }
}