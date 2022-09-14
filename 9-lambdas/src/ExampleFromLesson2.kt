
fun main(){
    val user1 = User("Kirill", 35)
    val user2 = User("Olga", 25)
    val user3 = User("Ahmed", 45)
    val user4 = User("Masha", 16)

    val users = listOf(user1, user2, user3, user4)

    val maxAgeUser = users.maxBy {it.age}
    println(maxAgeUser)

    val filterUser = users.filter {it.name[0] == 'O'}
    println(filterUser)
}