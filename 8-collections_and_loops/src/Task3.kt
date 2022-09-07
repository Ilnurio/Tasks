/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val car1 = Car("Hyndai", "Solaris", 6.32 )
    val car2 = Car("BMW", "X5", 32.16)
    val car3 = Car("Mazda", "RX9", 17.89)
    val user1 = User("Kirill", 26, 6)

    val cars = listOf(car1, car2, car3)

    val check = SearchCarByUserAge(cars, user1)

    println(check)
}

fun SearchCarByUserAge(cars: List<Car>, user: User): List<Car>{
    val result = mutableListOf<Car>()
    for (car in cars){
        val condition1 = user.age >= 26 && user.experience >= 6
        val condition2 =user.age >= 21 && user.experience >= 2 && car.brand != "Audi" && car.brand != "BMW"
        if (condition1 == true || condition2 ==true)
            result.add(car)
    }
    return result
}



