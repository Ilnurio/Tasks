fun main() {
    val robot1 = Robot(1)
    robot1.callToClient("Kirill")

    val manager1 = Manager("Olga", 12500)
    manager1.callToClient("Masha")

    val clientWorkers = listOf<ClientWorkers>(robot1, manager1)
        for (clientworker in clientWorkers)
            clientworker.callToClient("Sasha")
}

interface ClientWorkers {
    fun callToClient(clientName: String)
    fun emailToClient(clientName: String)
}

class Robot(val id:Int) : ClientWorkers{
    override fun callToClient(clientName: String) {
        println("Робот $id: звоню клиенту $clientName")
    }

    override fun emailToClient(clientName: String) {
        println("Робот $id: отправляю E-mail клиенту $clientName")
    }
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

class Manager(name: String, salary: Int) : Employee(name, salary), ClientWorkers {

    override fun callToClient(clientName: String) {
        println("Менеджер ${name}: звоню клиенту $clientName")
    }

    override fun emailToClient(clientName: String) {
        println("Менеджер ${name}: отправляю E-mail клиенту $clientName")
    }

    override fun addProject(projectName: String) {
        projects.add(projectName)
        println("Менеджер: ${name} передал работу над проектом: $projectName программистам")
    }
}