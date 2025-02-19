package games

/*
programa de piedra papel o tijera  a su eleccion

el programa mostrara ña eleccion

el programa manejar entradas invlaidas o numeros mas mayores
 */

fun main(){
    println("ingresa un numero del 1 al 3 donde (\n1 piedra \n2 tijera \n3 papel)\n")
    var choiceInput = readlnOrNull()?.toIntOrNull()
    var isValidInput = choiceInput != null && choiceInput in 1  ..  3
    while (!isValidInput){
        println("entrada no valida, ingresa 1,2 o 3")
        choiceInput = readlnOrNull()?.toIntOrNull()
        isValidInput= choiceInput != null && choiceInput in 1  .. 3
    }

    println("juego se ejecuto")
    val computerChoice=(1 .. 3).random()
    val computerChoiceSring = when{
        choiceInput == computerChoice -> "Empete"
        computerChoice == 1 -> "Piedra"
        computerChoice == 2 -> "Tijera"
        computerChoice == 3 -> "Papel"
        else -> "La computadora eligio"
    }
    println()
    val winner = when{
        choiceInput == computerChoice -> "Empete"
        choiceInput == 1 && computerChoice == 2 -> "El jugador"
        choiceInput == 2 && computerChoice == 3 -> "El jugador"
        choiceInput == 3 && computerChoice == 1 -> "El jugador"
        else -> "La computadora"
    }
        println("El ganador es $winner")
    }

