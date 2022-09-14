fun main(){
    val employee1 = Employee("Kirill", 15000)
    val employee2 = Employee("Olga", 30000)
    //employee1.callToClient("Peresvet")
    //employee2.callToClient("Vladimir")
    employee1.addProjectName("Проект №1")
    employee1.printAllprojects()

    employee2.addProjectName("Проект №2")
    employee2.printAllprojects()
}

class Employee(val name: String, val salary: Int) {
    private val projects: MutableList<String> = mutableListOf<String>()

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }

    fun addProjectName(projectName: String) {
        projects.add(projectName)
        println("Сотрудник: ${name} начал работу над проектом: ${projectName}")
    }

    fun printAllprojects(){
        for(project in projects)
            println(project)
    }
}