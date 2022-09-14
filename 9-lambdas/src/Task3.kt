/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
        val user1 = User("Kirill", 108)
        val user2 = User("Lena", 110)
        val user3 = User("Alexander", 188)
        val user4 = User("Yana", 102)

        val users = listOf(user1, user2, user3, user4)

        val levelAge = elementCount(users) {user: User -> user.age > 100}

        println(levelAge)
}

fun elementCount(users: List<User>, condition:(User) -> Boolean): Int {
    var userCount = 0
    for (user in users)
       if (condition(user) == true)
           userCount++
    return userCount
}