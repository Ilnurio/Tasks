/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
    val user1 = User("Kirill", 25)
    val user2 = User("Olga", 45)
    val user3 = User("Sasha", 35)
    val user4 = User("Masha", 90)

    val users = listOf(user1, user2, user3, user4)

    val convertToString = convertToStrings(users) { user: User -> listOf<User>().joinToString {","}}

    println(convertToString)
}

fun convertToStrings(users: List<User>, conversion: (User) -> String): List<User> {
    val convertUsers = mutableListOf<User>()
    for (user in users)
        when {
            conversion(user) == String() -> convertUsers.add(user)
        }
    return convertUsers
}




