package com.carlosdev.firstkotlinprogram

fun main(args: Array<String>) {
    var myCharRange: CharRange = 'a'.rangeTo('j') // Creamos un rango de caracteres desder la
    // a a la j
    var myChar: Boolean = 'k' in myCharRange // Con esta expresión verificamos si k esta incluida en el rango
    // que anteriormente creamos, no debe de estar incluida
    println("myCharRange has k : " + myChar)
}