/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

fun main() {
    val a = 10
    val b = 5

    val maxNumber = getMaxNumber(a,b)

    println(maxNumber)
}

fun getMaxNumber(firstNumber:Int, secondNumber:Int):Int{
    val result = if(firstNumber > secondNumber)
        firstNumber
    else
        secondNumber
    return result
}