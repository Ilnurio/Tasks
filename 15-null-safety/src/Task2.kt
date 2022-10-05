/*
Есть классы:
class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

Напишите функцию fun employeeCity(employee: Employee): String, которая возвращает название города,
в которой располагается организация, в которой работает данный человек.
В случае если он нигде не работает (в company лежит null), функция должна выводить: «Неизвестен»
Используйте функции безопасного вызова и оператор элвис

Для этой задачи есть видео с разбором.
*/

fun main() {
    val address1 = Address("Ленина 5", "Воронеж")
    val address2 = Address("Маркса", "Бавлы")
    val company1 = Company("Epub", address1)
    val company2 = Company("Васильки", address2)
    val employee1 = Employee("Kirill", company1)
    val employee2 = Employee("Masha", null)

    println(employeeCity(employee1))
    println(employeeCity(employee2))

}

class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

fun employeeCity(employee: Employee): String {
    return employee.company?.address?.city ?: "Неизвестен"
}
