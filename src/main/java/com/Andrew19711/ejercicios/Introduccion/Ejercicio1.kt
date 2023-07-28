package com.Andrew19711.ejercicios.Introduccion

class Ejercicio1 {
}

fun main(){
    println("Digite su Nombre")
    val Nombre:String= readLine().toString()
    println("Digite el tipo de documento")
    var tdocument:String= readLine().toString()
    println("Digite el numero de documento")
    var Ndocument:Int= readLine()!!.toInt()
    println("Digite su telefono")
    var tel:Int= readLine()!!.toInt()
    println("Digite el seria de su ordenador")
    var SerialPC:String= readLine().toString()
    println("Digite el serial de su teclado")
    var SerialTC:String =readLine().toString()
    println("Digite el serial del mouse")
    var SerialM= readLine().toString()
    println(" \n${Nombre} su bitacora esta completa!")
}
