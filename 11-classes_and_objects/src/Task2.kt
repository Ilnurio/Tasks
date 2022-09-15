
/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/

fun main() {
    val round = Round(5)

    println("Площадь окружности: ${round.area()}")
    println("Длина окружности: ${round.lengthOfRound()}")
}

class Round(val radius:Int) {
    fun area(): Double {
        return Math.PI * radius * radius
    }

    fun lengthOfRound(): Double{
        return 2 * Math.PI * radius
    }
}
