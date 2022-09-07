/*
Написать функцию, которая возвращает текстовое представление для целых чисел от 1 до 5:
1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»
Если на вход приходит любое другое число, то возвращать: «ошибка»

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val a:Int = 5

    val getResult = numberToLetter(a)

    println(getResult)
}

fun numberToLetter(number: Int) {
    val result = when{
        number == 1 -> println("один")
        number == 2 -> println("два")
        number == 3 -> println("три")
        number == 4 -> println("четыре")
        number == 5 -> println("пять")
        else -> println("ошибка")
    }
    return result
}
