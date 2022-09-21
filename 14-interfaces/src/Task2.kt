/*
Создайте класс Animal с полями name: String, x: Int, y: Int, который будет реализовывать интерфейс Movable
из предыдущей задачи (любой вариант реализации на ваш выбор)

Для этой задачи есть видео с разбором.
*/

fun main(){
    val animal1 = Animal("Лиса", 1,2)
    animal1.moveLeft(9)

}

class Animal(name: String, x: Int, y:Int): Movable{

    var x:Int = 0
    var y:Int = 0

    override fun moveLeft(step: Int) {
        x -= step
        return println("Животное пошло на $step шаг(а) влево")
    }
    override fun moveRight(step: Int) {
        x += step
        return println("Животное пошло на $step шаг(а) вправо")
    }
    override fun moveDown(step: Int) {
        y += step
        return println("Животное пошло на $step шаг(а) назад")
    }

    override fun moveUp(step: Int) {
        y -= step
        return println("Животное пошло на $step шаг(а) вперед")
    }

}