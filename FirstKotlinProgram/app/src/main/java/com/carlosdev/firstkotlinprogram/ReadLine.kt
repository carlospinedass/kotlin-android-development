package com.carlosdev.firstkotlinprogram

fun main(args: Array<String>) {
    println("What is your name")
    var name:String? = readLine()
    print("How old are you? ")
    var age:Int = readLine()!!.toInt()

    println("Your name is $name and your age is " + age)
}