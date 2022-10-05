
fun main(){
    val childrenCount: Int? = null

    val user:User? = null
}

data class User(val name: String, val age:Int?)

// Первый вариант работы с null
fun main1(){
    val inputСhildrenCount:Int? = null
    val childrenCount = if(inputСhildrenCount == null)
        0
    else
        inputСhildrenCount
}

//Второй вариант работы с null

fun main2(){
    val inputchildrenCount:Int? = 2
    val childrenCount = inputchildrenCount ?: 0
}

fun main3(){
    val rectangle: Rectangle? = null

    //if (rectangle != null)
        //rectangle.printArea() - первый варинт, громоздкий
    rectangle?.printArea()
}

class Rectangle(val a:Int, val b:Int){
    fun printArea(){
        val result = a * b
        println(result)
    }
}



