package com.sam.bmi

fun main () {
    //val secret = 7
    val secret = (1..10).random()
    //println("secret: $secret")

    var inputnum:Int = 0
    var bingo = false
    var minnum:Int=1
    var maxnum:Int=10

    while(!bingo) {
        print("Please enter a number($minnum-$maxnum): ")
        val input = readLine()
        inputnum = input?.toIntOrNull() ?:0

        if (inputnum > 0 && inputnum <= 10) { //Filter null ,0 and over than 10 cases
            if (inputnum < secret) {
                minnum=inputnum
            } else if (inputnum > secret) {
                maxnum=inputnum
            } else {
                println("You got it")
                bingo = true
                break
            }
        }
    }
}