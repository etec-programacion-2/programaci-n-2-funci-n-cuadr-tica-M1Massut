/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example
// main generales
fun main() {
    cuadratica()
    valores_de_la_funcion()
    raizes()
}
//Función cuadratica impresa en consola
fun cuadratica (){
    val a = 5.0
    val b = -3.0
    val c = 6.0
    if (a === 0.0) {
        println("No se puede poner que a=0 ")
        return
    }

    println("La cuenta quedaria así ${a}x² + ${b}x + $c = y")
}

fun valores_de_la_funcion (){
    val a = 5.0
    val b = -3.0
    val c = 6.0

    for (x in -10..10) {
        val y = a * x * x + b * x + c
        println("f($x) = $y")
    }
}
//Calculo de raices 
fun raizes(){
    var a = -5.02
    var b = -3.09
    var c = 6.03

var raiz1 :Double= 0.0
var raiz2 : Double= 0.0 
var discriminante : Double = b * b - 4 * a * c //calculo de descriminante 
if (discriminante > 0) {
    raiz1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)
    println("Raiz uno:$raiz1") 
    raiz2 =  (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)
    println("Raiz dos: $raiz2")
} else if (discriminante == 0.0) {
    println("La ecuacion tiene una raiz real doble")// si el discriminante es mayor a 0 y tiene dos raices reales 
    println("Raiz uno:${(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)}")
} else {
    println("La ecuacion no tiene raices reales")// si el discriminante es menor a 0 y no tiene raices reales
}

val dos_decimales = String.format("Raices: x₁ = %.2f, x₂ = %.2f", raiz1, raiz2)//Imprecion de las raices con decimales
    println(dos_decimales)
}