/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса Employee  и возвращает средний возраст всех сотрудников.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/
// 1 способ напрямую, используя метод .average у листа
/*fun main() {
    val user1 = Employee("Kirill", 45)
    val user2 = Employee("Sasha", 32)
    val user3 = Employee("Artur",57)
    val user4 = Employee("Dima ", 90)
    val user5 = Employee("Vilgelm", 99)

    val users = listOf(user1.age, user2.age, user3.age, user4.age, user5.age)

    val middleAge = users.average()

    println(middleAge)
}*/

fun main() {
    val user1 = Employee("Kirill", 45)
    val user2 = Employee("Sasha", 59)
    val user3 = Employee("Artur", 57)
    val user4 = Employee("Dima ", 90)
    val user5 = Employee("Vilgelm", 99)

    val middleAge = getMiddleAge(user1.age, user2.age, user3.age, user4.age, user5.age)

    println(middleAge)
}

fun getMiddleAge(age1:Int, age2:Int, age3:Int, age4:Int, age5:Int): Double {
    val users = listOf(age1, age2, age3, age4, age5)
    val result = users.average()
    return result
}