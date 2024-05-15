package com.sam.bmi

fun main() {
    var name:String? = "Hank"
    //var name:String? = null
    //println(name.length)
    //println(name.get(1))

    //?: 倒過來像貓王符號, if left is null, right will give fixed value ex:0
    println(name ?: 0)

    //After variable add "?", is if variable is not null just run function
    //otherwise no run function and return null string
    //var name:String? = null
    //println(name?.length)
    //println(name?.get(1))


    var counter = 0;
    counter = counter +1
    counter++
    counter = counter -1
    println(counter)

    //Int/Int-> Int
    println(10 / 3.0)

    //Boolean
    var b = false;
    var a = true;
    println(a && b) // and
    println(a || b) // or
    //
    val num = -8
    println(num <= 5 && num>=-3)
    //
    println(num > 5 || num < -3)


}