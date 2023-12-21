package com.carlosdev.firstkotlinprogram

fun main(args: Array<String>) {
    var number:Double = 7.6
    var isCheck: Boolean = true
    println("+number = " + +number) // Multiplica por positivo, no se efectuan cambios en el valor
    println("-number = " + -number) // Multiplica por negativo al valor actual
    println("++number = " + ++number) // Aumenta el valor de 1
    println("--number = " + --number) // Disminuye el valor en 1
    println("!isCheck = " + !isCheck) // Multiplica un valor booleano por negativo, cambia el valor

    println("-------------------------------------")
    var result:Double = 4.7
    println("result++ = " + result++) // Si utilizamos el operador de incrementio result++ este nos
    // devolverá el valor anterior sin el aumento
    println("result++ = " + result)
    println("result++ = " + ++result) // Si utilizamos el valor de incremento antes esto nos devol-
    // verá el valor ya con el aumento
    println("result++ = " + result)
}