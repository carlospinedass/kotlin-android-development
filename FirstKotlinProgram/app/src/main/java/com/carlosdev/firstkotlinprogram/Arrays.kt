package com.carlosdev.firstkotlinprogram

fun main(args: Array<String>) {
    var age = arrayOf(1, 2, 3)
    println("First element of the Array = " + age[0])
    println("Second element of the Array = " + age.get(1))
    println("Third element of the Array = " + age[2])

    var cars = arrayOf("Mercedes", "BMW", "Opel")

    println("---------------------------------------")

    println("First element of Array = " + cars[0])
    println("First element of Array = " + cars.get(1))
    println("First element of Array = " + cars[2])

    cars.set(2, "Ford") // Cambiar el valor de un índice de un array

    println("First element of Array = " + cars[0])
    println("First element of Array = " + cars.get(1))
    println("First element of Array = " + cars[2])

    println("Size of cars array" + cars.size)

    var carsAndAge = arrayOf("Mercedes", 5, "Opel", 10)
    println("------------------------------------------")

    println("First Element of Array = " + carsAndAge[0])
    println("Second Element of Array = " + carsAndAge.get(1))
    println("Third Element of Array = " + carsAndAge[2])
    println("Fourth element of Array = " + carsAndAge[3])

    carsAndAge.set(4, 20) // Si intentamos agregar un elemento a un array que es de tipo Array nos
    // genera un problema ya que los array no nos permiten agregar elementos, para eso debemos
    // utilizar
}
