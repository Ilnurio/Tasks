/*
Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val a: Int = 10
    val b: Int = 25

    val maxNumber = getResult(a, b)

    println(maxNumber)
}

fun getResult(number1: Int, number2: Int) {
    val result = when {
        number1 > number2 -> println("первое число больше")
        number2 > number1 -> println("второе число больше")
        else -> println("числа равны")
    }
    return result
}