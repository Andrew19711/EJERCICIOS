package com.Andrew19711.ejercicios.Introduccion

class Ejercicio3 {
}
fun main(){
    println("Ingrese el peso del Bebe:")
    var P: Float= readLine() !!.toFloat()
    println("Ingrese la edad del Bebe:")
    var E: Int= readLine() !!.toInt()
    println("la dosis de la vacuna del Bebe es:\n${ P+10/E*10*8}")
}