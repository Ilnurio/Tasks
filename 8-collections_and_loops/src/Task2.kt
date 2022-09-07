/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса Employee и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val user1 = Employee("Kirill", 65)
    val user2 = Employee("Sasha", 59)
    val user3 = Employee("Artur", 57)
    val user4 = Employee("Dima ", 90)
    val user5 = Employee("Vilgelm", 99)

    val users = listOf(user1, user2, user3, user4, user5)

    val minAge = getMinAge(users)

    println(minAge)
}

fun getMinAge(users: List<Employee>): Employee {
    var minAgeEmployee = users[0]

    for (employee in users)
        if (employee.age < minAgeEmployee.age)
            minAgeEmployee = employee
    return minAgeEmployee
}

/*fun main() {
    val user1 = Employee("Kirill", 45)
    val user2 = Employee("Sasha", 59)
    val user3 = Employee("Artur", 57)
    val user4 = Employee("Dima ", 90)
    val user5 = Employee("Vilgelm", 99)

    val minAge = getMinAge(user1.age, user2.age, user3.age, user4.age, user5.age)

    println(minAge)
}

fun getMinAge(age1:Int, age2:Int, age3:Int, age4:Int, age5:Int): Int? {
    val users = listOf(age1, age2, age3, age4, age5)
    val result = users.minOrNull()
    return result
}*/