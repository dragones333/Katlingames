package games

class JAndradePrimos {
    fun verificarPrimo(numero: Int) {
        if (numero < 1) {
            println("Ingresa un número válido")
            return
        }

        if (numero == 1) {
            println("no es número primo.")
            return
        }

        var esPrimo = true
        for (i in 2..numero / 2) {
            if (numero % i == 0) {
                esPrimo = false
                break
            }
        }

        if (esPrimo) {
            println("es un número primo")
        } else {
            println("no es un número primo")
        }
    }
}

fun main() {
    print("Ingresa un número: ")
    val numero = readlnOrNull()?.toIntOrNull()

    if (numero == null) {
        println("Número no válido")
        return
    }

    val obj = JAndradePrimos()
    obj.verificarPrimo(numero)
}
