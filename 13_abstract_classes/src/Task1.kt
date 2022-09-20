/*
Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
оставив реализацию полиморфной для классов Rectangle и Round
Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

Для этой задачи есть видео с разбором.
*/
fun main(){
    val rectangle1 = Rectangle(3,4,0)
    val round1 = Round(0,0,6)
    rectangle1.lenght()
    rectangle1.area()
    round1.lenght()
    round1.area()
}

abstract class Figure(val width:Int, val height:Int, val radius: Int){
    abstract fun lenght()
    abstract fun area()
}

class Rectangle(width: Int, height: Int, radius: Int): Figure(width, height, radius){
    override fun lenght() {
        val result = 2*(width+height)
        return println("Периметр прямоугольника равен: $result")
    }
    override fun area(){
        val result = width*height
        return println("Площадь прямоугольника равен: $result")
    }
}

class Round(width: Int, height: Int, radius: Int): Figure(width, height, radius){
    override fun lenght() {
        val result = 2*Math.PI*radius
        return println("Длина окружности равна: $result")
    }

    override fun area(){
        val result = Math.PI*radius*radius
        return println("Площадь окружности равна: $result")
    }
}