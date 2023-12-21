package com.carlosdev.firstkotlinprogram

fun main(args: Array<String>) {
    println("------inmutable map of-------")
    // inmutable collection
    var age = mapOf<String, Int>("david" to 20, "ronaldo" to 25) // la asignación para un map es
    // [llave to valor]

    println("age of david : " + age["david"])
    println("age of ronaldo : " + age["ronaldo"])

    // mutable collection
    var mutableAge = mutableMapOf<String, Int>("david" to 20, "ronaldo" to 25)
    mutableAge.put("buffon", 30)
    println("------mutable map of-------")
    println("Age of David : " + mutableAge["david"])
    println("Age of Ronaldo : " + mutableAge["ronaldo"])
    println("Age of Buffon : " + mutableAge.get("buffon"))
}