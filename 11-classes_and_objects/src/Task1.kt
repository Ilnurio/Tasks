/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором. Обновлено
*/

fun main() {
    val rectangle1 = Rectangle(3, 4)

    rectangle1.area(4,4)
    rectangle1.perimetr(4,4)
    rectangle1.checkRectangleForSquare(4,4)
}

class Rectangle(val width: Int, val height: Int){

    fun area(width:Int,height: Int){
        val area = width * height
        return  println("Площадь прямоугольника равна: $area")
    }

    fun perimetr(width:Int, height: Int){
        val perimetr = (2*(width+height))
        return println("Периметр прямоугольника равен: $perimetr")
    }

    fun checkRectangleForSquare(width:Int, height: Int){
        if(width == height)
            println("Прямоугольник является квадратом")
        else
            println("Это таки прямоугольник")
    }
}