
fun main(){
    val childrenCount: Int? = null

    val user:User? = null
}

data class User(val name: String, val age:Int?)

// Первый вариант работы с null
fun main1(){
    val inputchildrenCount:Int? = null
    val childrenCount = if(inputchildrenCount == null)
        0
    else
        inputchildrenCount
}

//Второй вариант работы с null



