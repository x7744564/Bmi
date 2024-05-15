package com.sam.bmi

import kotlin.random.Random


fun main() {
    //print(Random.nextInt())
    //Generation 10 times random value between 1 to 11
//    println(Random.nextInt(1,11))
//    println((1..10).random())

    //number array
    val array = intArrayOf(2,5,8)
    println(array[1])

    //Exception
    //print(array[3])

    //string array
    val ss = arrayOf("Sun","MON", "TUE")
    println(ss.size)
    println(ss.get(0))
    for (day in ss) {
        println(day)
    }


    //For
    val range = 0..10
    for(i in 1..30) {
        //println(i)
        //println("*")
        if(i%2 == 1){
            print("*")
        }else {
            print("  ")
        }
    }
    println()
    for (i in 1..10 step 2) print(i)
    println()

    //val secret = 7
    val secret = (1..10).random()
    println("secret: $secret")

    var num:Int = 0
    var bingo = false
    for (i in 1..3) {
        print("Please enter a number(1-10): ")
        val input = readLine()
        num = input?.toIntOrNull() ?:0
        println("The number you entered: $num")

        if (num < secret) {
            println("Bigger")
        } else if (num > secret) {
            println("Smaller")
        } else {
            println("You got it")
            bingo = true
            break
        }
        if(!bingo) {
            println("Failed, the secret")
        }

    }
//    while(num != secret) {
//        print("Please enter a number(1-10): ")
//        val input = readLine()
//        num = input?.toIntOrNull() ?:0
//        println("The number you entered: $num")
//
//        if (num < secret) {
//            println("Bigger")
//        } else if (num > secret) {
//            println("Smaller")
//        } else {
//            println("You got it")
//        }
//
//    }

}
