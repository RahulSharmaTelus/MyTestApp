package com.example.mytestapp.healper

/**
 * This is test class taking a string argument country.
 */
class TestClass constructor(country: String) {

    var abc = country

    /**
     * This is the secondary constructor of Test class.
     */
    constructor(pmName: String, age: Int) : this("India") {
        println("PM Name: $pmName\nAge: $age")
    }

}
