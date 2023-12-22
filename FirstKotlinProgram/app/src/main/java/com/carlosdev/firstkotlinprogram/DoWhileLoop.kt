package com.carlosdev.firstkotlinprogram

fun main(args: Array<String>) {
    var number = 1
    // Con el do while realizamos la ejecución antes de la condición, siempre se ejecuta el cuerpo
    // una vez
    do {
        print("$number")
        number++
    } while (number < 15)
}