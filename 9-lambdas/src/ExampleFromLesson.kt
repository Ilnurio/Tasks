
fun main(){
    val user1 = User("Kirill", 35)
    val user2 = User("Olga", 25)
    val user3 = User("Ahmed", 45)
    val user4 = User("Masha", 16)

    val users = listOf(user1, user2, user3, user4)

    val filteredUsers = filterUserByCondition(users) { user: User -> user.age > 18 }
    val filterUser1 = filterUserbyConditionForLetter(users) { user: User -> user.name[0] == 'O' }

    println(filteredUsers)
    println(filterUser1)

}


fun filterUserByCondition(users: List<User>, condition: (User)-> Boolean): List<User>{
    val filterUsers = mutableListOf<User>()
    for (user in users)
        if(condition(user))
            filterUsers.add(user)
    return filterUsers
}

fun filterUserbyConditionForLetter(users: List<User>, condition: (User) -> Boolean): List<User>{
    val filterUser = mutableListOf<User>()
    for (user in users)
        if (condition(user))
            filterUser.add(user)
    return filterUser
}


fun filterUserByAge(users: List<User>, minAge:Int): List<User>{
    val filteredUsers = mutableListOf<User>()
    for (user in users)
        if (user.age > minAge)
            filteredUsers.add(user)
    return filteredUsers
}


fun filterUserByFirstLetter(users: List<User>, firstLetter: Char): List<User>{
    val filterUsers = mutableListOf<User>()
    for (user in users)
        if(user.name[0] == firstLetter)
            filterUsers.add(user)
    return filterUsers
}