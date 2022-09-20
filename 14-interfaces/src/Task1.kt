/*
Создайте интерфейс Movable (перемещаемый), в котором будут описаны функции moveLeft(step: Int), moveRight(step: Int),
moveDown(step: Int), moveUp(step: Int).

Сделайте так, чтобы класс Figure из предыдущего задания реализовывал интерфейс Movable (скопируйте сюда код написанного
вами класса Figure)

Для этой задачи есть видео с разбором..
*/

interface Movable{
    fun moveLeft(step: Int)
    fun moveRight(step: Int)
    fun moveDown(step: Int)
    fun moveUp(step: Int)
}

abstract class Figure(val color: String, var x: Int, var y:Int): Movable {

    abstract fun area(): Double
    abstract fun length(): Double

    override fun moveLeft(step: Int) {
        x -= step
    }

    override fun moveRight(step: Int) {
        x += step
    }

    override fun moveDown(step: Int) {
        y += step
    }

    override fun moveUp(step: Int) {
        y -= step
    }
}

class Rectangle(color: String,x: Int, y: Int, val width: Double, val height: Double) : Figure(color,x,y), Movable {
    override fun area(): Double {
        return width * height
    }

    override fun length(): Double {
        return 2 * (width + height)
    }

    fun isSquare(): Boolean {
        return width == height
    }
}

class Round(color: String,x: Int, y: Int, val radius: Double) : Figure(color,x,y), Movable {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
    override fun length(): Double {
        return 2 * Math.PI * radius
    }
}