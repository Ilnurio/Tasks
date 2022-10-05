/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет.
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {
    val employee1 = SomeEmployee("Kirill", 12500)
    val employee2 = SomeEmployee("Artem", 40000)
    val employee3 = SomeEmployee("Olga", 14000)
    val employee4 = SomeEmployee("Sasha", 45000)
    val employee5 = SomeEmployee("Arfa", 50000)

    val employees = listOf<SomeEmployee>(employee1, employee2, employee3, employee4, employee5)

    findEmployeeBySalary(employees, 50000)?.callToClient("Masha")
}

class SomeEmployee(val name: String, val salary: Int) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee? {
    for (employee in employees) {
        if (employee.salary == salary) {
            println("Cотрудник с подходящей зарплатой: ${employee.name}")
            return employee
        }
    }
    return null
}