/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

fun main() {

    val user1 = User("Kirill", 21, 2)
    val car1 = Cars("BMW", 8.32)

    val check = getCheck(user1, car1)

    println(check)
}

data class User(val name:String, val age:Int, val experience:Int)
data class Cars(val brand:String, val price:Double)

fun getCheck(user1: User, car1: Cars): String{
    val result = when{
        user1.age >= 26 && user1.experience >= 6 -> "Доступны все авто"
        user1.age >= 21 && user1.experience >= 2 && car1.brand != "Audi" -> "Доступен только солярис"
        else -> "Иди катайся на самокате щенок"
    }
    return result
}