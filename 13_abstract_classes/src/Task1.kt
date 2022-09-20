import kotlin.math.sqrt

/*
Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
оставив реализацию полиморфной для классов Rectangle и Round
Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

Для этой задачи есть видео с разбором.
*/
fun main(){
    val rectangle1 = Rectangle("Red", 4,5)
    val round1 = Round("Blue", 9)
    val triangle1 = Triangle("Yellow", 20.0, 30.0, 16.0)
    rectangle1.lenght()
    rectangle1.area()
    round1.lenght()
    round1.area()
    triangle1.lenght()
    triangle1.area()
}

abstract class Figure(val color:String){
    abstract fun lenght()
    abstract fun area()
}

class Rectangle(color: String,val width: Int,val height: Int): Figure(color){
    override fun lenght() {
        val result = 2*(width+height)
        return println("Периметр прямоугольника равен: $result")
    }
    override fun area(){
        val result = width*height
        return println("Площадь прямоугольника равен: $result")
    }
    fun isSquare(): Boolean {
        return width == height
    }
}

class Round(color: String,val radius: Int): Figure(color){
    override fun lenght() {
        val result = 2*Math.PI*radius
        return println("Длина окружности равна: $result")
    }

    override fun area(){
        val result = Math.PI*radius*radius
        return println("Площадь окружности равна: $result")
    }
}

class Triangle(color: String, val a:Double, val b:Double, val c:Double): Figure(color){
    override fun lenght(){
        val result = a + b + c
        return println("Периметр треугольника равен: $result")
    }
    override fun area(){
        val p = (a+b+c)/2
        val result= sqrt(p * (p - a) * (p - b) * (p - c))
        return println("Площадь треугольника: $result")
    }
}