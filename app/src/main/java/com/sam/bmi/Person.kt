package com.sam.bmi

// in constructor() variable is property
class Person constructor(val name: String, val weight: Float, val height: Float) {
    fun bmi(): Float {
        //區域變數 Local Variable
        val bmi = weight/(height * height)
        return bmi
    }
    fun Hello(){
        println("Hello!")
    }
}