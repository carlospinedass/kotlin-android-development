package com.carlosdev.firstkotlinprogram

fun main(args: Array<String>) {
    print("Please enter your age : ")
    var yourAge:Int = readLine()!!.toInt()

    if (yourAge < 13) {
        println("You are a child")
    } else if (yourAge < 19) {
        println("You are a teenager")
    } else {
        println("You are an adult")
    }
}