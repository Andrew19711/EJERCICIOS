package com.Andrew19711.ejercicios.Introduccion

class Ejercicio4 {
}

fun main(){
    println("Digite un numero")
    var num1:Double= readLine()!!.toDouble()
    println("Digite su segundo numero")
    var num2:Double= readLine()!!.toDouble()
    println("Las operaciones de los dos numeros digitados son suma: \n${num1+num2} resta: \n${num1-num2} multiplicacion: \n${num1*num2} division: \n${num1/num2}.")


}