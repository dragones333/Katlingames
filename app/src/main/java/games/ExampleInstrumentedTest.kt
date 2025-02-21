//package com.pjsoft.kotlingames.games
package games

// Adivina un número
// Se debe seleccionar un número dentro de un rango
// La computadora debe ser capaz de seleccionar ese número
// El programa debe solicitar al usuario ingresar la suposición
// Debe de asegurarse de recibir números válidos
// El juego termina cuando el jugador acierta el número

fun main() {
    val range = 1..10
    val numberToGuess = range.random()
    var attempts = 0
    var guess: Int? = null

    println("Bienvenido al juego de Adivina el Número")
    println("Estoy pensando en un número del 1 al 10. ¡Adivínalo!")

    do {
        print("Ingresa tu suposición: ")
        guess = readlnOrNull()?.toIntOrNull()

        if (guess != null){
            attempts++

            when {
                guess < numberToGuess -> println("El número es mayor.")
                guess < numberToGuess -> println("El número es menor.")
                else -> println("¡Felicidades! Le atinaste en $attempts intentos.")
            }
        }

//        if(guess != null){
//            // El número que se pasa es válido
//            if(guess == numberToGuess){
//                println("Felicidades, le atinaste")
//            } else if (guess > numberToGuess){
//                println("El número es menor")
//            }
//            else if (guess < numberToGuess){
//                println("El número es mayor")
//            }

        else {
            // No es un número válido
            println("Por favor, ingresa un número válido.")
        }

    } while (guess != numberToGuess)
}
