package com.sam.bmi

class Hello {

}

fun main(){
    val p = Person("Jack",65.5f, 1.7f)
    println(p.bmi())
    val hank = Person("Hank", 70f, 170f)
    println(p.name + "" + p.bmi())
    println(hank.name + "" + hank.bmi())

    p.Hello()


//    //BMI
//    val w=65.5f
//    val h=1.7f
//    val bmi = w / (h * h)
//    println("BMI:" + bmi)

}