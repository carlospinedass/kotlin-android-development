package com.carlosdev.firstkotlinprogram

/*
toByte()
toShort()
toInt()
toLong()
toFloat()
toDouble()
 */
fun main(args: Array<String>) {
    // Convertiendo desde tipo de datos pequeños a grandes
    var x:Byte = 127
    var y:Int = x.toInt()
    var z:Double = y.toDouble()

    // Convirtiendo data desde tipos grandes a pequeños, puede provocar pérdida de datos
    var a: Double = 132.32
    var b: Int = a.toInt()
    var c: Byte = b.toByte()

    println(a)
    println(b)
    println(c)


    println(x)
    println(y)
    println(z)
}