/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/

fun main() {
    val rectangle1 = Rectangle("Red", 0,0, 5.0, 5.0)
    val round1 = Round("Blue", 1,1,4.0)
    val triangle1 = Triangle("Yellow", 2,2,2.0, 3.0, 4.0)
    val animal1 = Animal("Lisa", 0,0)

    val FigureAndAnimal = listOf<Movable>(rectangle1, round1, triangle1, animal1)
        for (stepers in FigureAndAnimal)
    println(stepers.moveRight(10))
}