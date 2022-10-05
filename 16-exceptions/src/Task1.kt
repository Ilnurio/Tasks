/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
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