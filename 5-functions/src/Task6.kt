/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую
Boolean (доступно ему это авто или нет)

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/


fun main() {
    val age: Int = 21
    val experience: Int = 4
    val carBrand: String = "BMW"

    val checkRes = checkingUser(age, experience, carBrand)

    println(checkRes)
}

fun checkingUser(age:Int, experience:Int, carBrand:String): String {
    val userStatus = when {
        age >= 26 && experience >= 6 -> "Доступны все авто"
        age >= 21 && experience >= 2 && carBrand != "Audi" || carBrand != "BMW" -> "Доступны все авто кроме Audi и BMW"
        else -> "Услуги каршеринга недоступны"
    }
    return userStatus
}