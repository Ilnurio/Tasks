/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/

fun main() {
    val user1 = Employee("Kiril", 35)
    val user2 = Employee("Olga", 47)
    val user3 = Employee("Sasha", 25)
    val user4 = Employee("Marina", 89)
    val user5 = Employee("Peresvet", 92)
    val users1 = listOf(user1, user2, user3)
    val users2 = listOf(user4, user5)

    val itDep = Department("ДепартаментIT", users1)
    val accountDep = Department("Департамент Динозавров", users2)
    val depart = listOf(itDep, accountDep)

    val sharashMontaj = Company("Шараш Монтаж", depart)

    val totalNumber = totalNumberOfEmployees(sharashMontaj)
    println("Общее число сотрудников: $totalNumber")

    val average = averageAgeOfEmployees(sharashMontaj)
    println("Средний возраст сотрудников $average")
}

fun totalNumberOfEmployees(company: Company):Int{
    var sum = 0
    for(users in company.departments)
        sum += users.employees.size
        return sum
}

fun averageAgeOfEmployees(company: Company): Int {
    var sum1 = 0
    var sum2 = 0

    for (deparments in company.departments) {
        sum1 += deparments.employees.size

        for (users in deparments.employees) {
            sum2 += users.age
        }
    }
    return sum2 / sum1
}