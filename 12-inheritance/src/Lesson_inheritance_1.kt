fun main() {
    val programmer1 = Programmer("Kirill", 13000)
    programmer1.addProject("Проект №1")

    val programmer2 = Programmer("Oleg", 13000)
    programmer2.addProject("Проект №2")

    val manager1 = Manager("Ysuf", 12000)
    manager1.addProject("Проект №3")

    val employees = listOf<Employee>(programmer1, programmer2, manager1)
    for (employee in employees)
        employee.addProject("Общий проект")

    for (employee in employees)
        employee.printAllprojects()
}

open class Employee(val name: String, val salary: Int) {
    private val projects: MutableList<String> = mutableListOf<String>()

    fun addProject(projectName: String) {
        projects.add(projectName)
        println("Сотрудник: ${name} начал работу над проектом: $projectName")
    }

    fun printAllprojects() {
        for (project in projects)
            println("Проекты сотрудника $name: ${projects.joinToString()}")
    }
}

class Programmer(name: String, salary: Int) : Employee(name, salary) {
    private val projects: MutableList<String> = mutableListOf<String>()

    fun readArticle(articleName: String) {
        println("Программист $name читает статью $articleName")
    }
}

class Manager(name: String, salary: Int) : Employee(name, salary) {
    private val projects: MutableList<String> = mutableListOf<String>()

    fun callToClient(clientName: String) {
        println("Менеджер ${name}: звоню клиенту $clientName") //=
    }
}