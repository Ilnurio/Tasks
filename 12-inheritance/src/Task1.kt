/*
Для созданных в предыдущих задачах классов Rectangle и Round (нужно сюда скопировать ваш код этих классов)
пропишите суперкласс Figure, в котором будет поле цвет типа String, которое должно инициализироваться через конструктор
и два поля x и y типа Int, которые будут задавать положение фигуры в пространстве относительно начала координат
и инициализироваться в теле класса начальными значениями ноль.

Пропишите в этом классе функции moveLeft(step: Int), moveRight(step: Int), moveDown(step: Int), moveUp(step: Int),
которые будут сдвигать фигуру, то есть менять ее координаты x и y

Сделайте Rectangle и Round наследниками класса Figure

Для этой задачи есть видео с разбором.
*/
fun main(){
    val round1 = Round("pink", 0,0)
    val rectangle1 = Rectangle("red", 0,0)
    round1.moveDown(5)
    rectangle1.moveRight(5)
}

open class Figure(val colour:String, val x:Int, val y:Int){
    fun moveLeft(step:Int){
        return println("Фигура сдвинулась налево, координаты фигуры (${x-step},${y})")
    }
    fun moveRight(step:Int){
        return println("Фигура сдвинулась направо, координаты фигуры (${x+step},${y})")
    }
    fun moveUp(step: Int){
        return println("Фигура сдвинулась вверх, координаты фигуры (${x},${y+step})")
    }
    fun moveDown(step: Int){
        return println("Фигура сдвинулась вниз, координаты фигуры (${x},${y-step})")
    }
}


class Round (colour: String, x: Int, y: Int): Figure(colour,x,y)

class Rectangle (colour: String, x: Int, y: Int): Figure(colour,x,y)