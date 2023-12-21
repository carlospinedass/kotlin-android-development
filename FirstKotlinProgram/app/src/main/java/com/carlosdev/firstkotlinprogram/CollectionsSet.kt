package com.carlosdev.firstkotlinprogram

fun main(args: Array<String>) {
    var mySetArray = arrayListOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")

    println(mySetArray.size)
    println(mySetArray.last()) // Access the last element of the array

    var mySetOf = setOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")

    println(mySetOf.size)
    println(mySetOf.last()) // Access the last element of the array
}