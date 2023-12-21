package com.carlosdev.firstkotlinprogram

fun main(args: Array<String>) {
    var a:String = "Hello Kotlin"
    var b: String = "Language"
    var age:Int = 25
    println("$a $b")
    //    println(a + " " + b)
    println("Your age is = " + age)

    var x: String = "Kotlin"
    var i:Int = x.length
    println("Length of Kotlin = " + i)

    var y:Boolean = x.equals("Java") // Compara el valor de una variable, similar al operador equals
    println(y)
    println(x.isEmpty()) // isEmpty verifica si la variable es una cadena vacia
    println(x.plus(" language")) // De esta forma podemos concatenar un String a otro string
    println(x.lowercase()) // Convierte un string a minúsculas
    println("******************")
    println(x.uppercase()) // Convierte un string a mayúsculas

    var t:String = "  Android   "
    println(x + t)
    println(x + " " + t.trim())
}