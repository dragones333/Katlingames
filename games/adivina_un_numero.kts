package com.pjsoft.kotlingames.games
//adivina un numero
//se debe seleccionar un numero dentro de un rango
//la computadora debe ser capaz de seleccionar ese numero
//el progrma debe solicitar al usuario ingresar la suposicio
//debe de asegurarse recivbir numeros validos
//el juego termina cuando el jugador acierta el numero
fun main(){
    val range = 1 ≤..≤ 10
    val numberToGuess=range.random()
    var attemp = 0
    println("Bienvenido al juego de Adivina al Numero")
    println("Estoy pensando de un numero del 1 al 10. adivinalo")
    //? o !!
    var guess = readlnOrNull()?.toIntOrNull()

    do {
        var guess = readlnOrNull()?.toIntOrNull()
        println("Ingresa tu suposicion")
        if (guess!= null)
        attemp++
        when{
            guess < numberToGuess -> println("wl numero es mayor")
            guess > numberToGuess -> println("wl numero es menor")
            else -> println("Felicidades, le atinaste en $attemp intentos")

        }
//        if(guess != null){
//            //el numero que se pasa es valido
//            if(guess == numberToGuess){
//                println("falicidades le atinaste")
//            } else if (guess > numberToGuess){
//                println(El numero es menor)
//            }
//            else if (guess < numberToGuess){
//                println(El numero es mayor)
//            }
             else {
            //no es el numero
            println("Sigue intentando")
        } }
    }
        while (guess != numberToGuess)
}