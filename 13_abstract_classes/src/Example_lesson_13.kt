fun main() {
    val programmer1 = Programmer("Kirill", 12500)
    programmer1.addProject("Project1")
    val manager1 = Manager("Olga", 12500)
    manager1.addProject("Project2")

    val employee = listOf<Employee>(programmer1, manager1)
        for (employees in employee)
            employees.addProject("Общий проект")
}

abstract class Employee(val name: String, val salary: Int) {
    protected val projects: MutableList<String> = mutableListOf<String>()

    abstract fun addProject(projectName: String)

    fun printAllprojects() {
        for (project in projects)
            println("Проекты сотрудника $name: ${projects.joinToString()}")
    }
}

class Programmer(name: String, salary: Int) : Employee(name, salary) {

    fun readArticle(articleName: String) {
        println("Программист $name читает статью $articleName")
    }

    override fun addProject(projectName: String) {
        projects.add(projectName)
        println("Программист: ${name} начал работу над проектом: $projectName")
    }
}

class Manager(name: String, salary: Int) : Employee(name, salary) {

    fun callToClient(clientName: String) {
        println("Менеджер ${name}: звоню клиенту $clientName")
    }

    override fun addProject(projectName: String) {
        projects.add(projectName)
        println("Менеджер: ${name} передал работу над проектом: $projectName программистам")
    }
}