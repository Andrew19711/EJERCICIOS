package com.Andrew19711.ejercicios.Introduccion

import kotlin.random.Random

class Ejercicio5 {
}

fun main(){
    println("Digite un numero")
    var aleatorio = Random()
    var num= aleatorio.nextInt(bound: 100)+1
    println("El numero es: \n${num}")
}