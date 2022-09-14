import kotlin.math.max

/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean


Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

/*fun main() {
    val user1 = User("Kirill", 108)
    val user2 = User("Lena", 110)
    val user3 = User("Alexander", 188)
    val user4 = User("Yana", 102)

    val users = listOf(user1, user2, user3, user4)

    val result = userByMaxAge(users) {user: User -> users.maxBy {it.age}}

    println("Наибольший возраст: $result")
}

fun userByMaxAge(users: List<User>, condition: (User) -> User): List<User> {
    val maxUser = mutableListOf<User>()
        for (user in users) {
            if (user == condition(user))
            maxUser.add(user)
        }
    return maxUser
}*/

/*fun main() {
    val user1 = User("Kirill", 108)
    val user2 = User("Lena", 110)
    val user3 = User("Alexander", 188)
    val user4 = User("Yana", 102)

    val users = listOf(user1, user2, user3, user4)

    val levelAge = minimumAge(users) {user: User -> user.age > 109}

    println(levelAge)
}

fun minimumAge (users: List<User>, condition: (User) -> Boolean): Boolean {
    for (user in users)
       return if (condition(user))
            true
        else
            false
}
*/