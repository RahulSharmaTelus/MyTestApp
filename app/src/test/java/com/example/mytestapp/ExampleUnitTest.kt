package com.example.mytestapp

import com.example.mytestapp.healper.Helper
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun getTextTest() {
        assertEquals("High", Helper.getText(110))
    }

    @Test
    fun getTextTest2() {
        assertEquals("Low", Helper.getText(30))
    }

    /*@Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }*/
}