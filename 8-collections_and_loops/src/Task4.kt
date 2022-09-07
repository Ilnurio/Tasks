/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val user1 = Employee("Kirill", 35)
    val user2 = Employee("Ola", 75)
    val user3 = Employee("Yana", 15)
    val users = listOf(user1, user2, user3)
    val accountDep = Department("Бухгалтерия", users)

    val midAgeUser = getMidAge(accountDep)

    println(midAgeUser)
}

fun getMidAge(user: Department):Int{
    var sum = 0
    for(users in user.employees)
        sum += users.age
    return sum/user.employees.size
}
