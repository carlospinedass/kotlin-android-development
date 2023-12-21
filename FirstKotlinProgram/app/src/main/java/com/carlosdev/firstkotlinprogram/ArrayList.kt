package com.carlosdev.firstkotlinprogram

fun main(args: Array<String>) {
    var age = ArrayList<Int>() // Si lo definimos como ArrayList podremos asignarle valor al array
    // despues de haberlo inicializado, de lo contrario tendriamos que asignarle un valor al momento
    // inicializarlo
    age.add(10)
    age.add(1, 15)
    age.add(20)
    println("First element of ArrayList = " + age[0])
    println("Second element of ArrayList = " + age.get(1))
    println("Third element of ArrayList = ${age[2]}")

    age.remove(15) // Si se utiliza remove debemos hacerlo usando el elemento no el index
//    age.removeAt(2) // Si se utiliza remove debemos hacerlo usando el elemento no el index
    println(age.size)


    // Utilizando arraListOf
    var cars = arrayListOf<String>("Opel", "BMW")
    cars.add("Ford")

    println("First element of ArrayList = " + cars[0])
    println("Second element of ArrayList = " + cars.get(1))
    println("Third element of ArrayList = ${cars[2]}")

    var myMixArrayList = ArrayList<Any>() // Para que el arrayList acepte cualquier tipo de dato
    // se le debe asignar el tipo de dato any
    myMixArrayList.add("Ford")
    myMixArrayList.add(5)
    myMixArrayList.add(2.5)
    myMixArrayList.add(false)
    myMixArrayList.add('K')

    println(myMixArrayList[0])
    println(myMixArrayList[1])
    println(myMixArrayList[2])
    println(myMixArrayList[3])
    println(myMixArrayList[4])

    // La diferencia principal entre arrayListOf y ArrayList es que en arrayListOf no necesitamos
    // inicializar con el constructor sencillamente podemos agregar valores desde la inicialización


}