class Book (){
    var name: String="яйцо черной козы"
    var autor: String="Сен Такацуки"
    var year: Int=2018
    var str: Int=78
    fun sayAge(){
        val age: Int = 2023-year
        when (age){
            in 1..4->println("книге $age года")
            in 21..24->println("книге $age года")
            else ->println("книге $age лет")
        }
    }
    fun sizebook(){
        when(str){
            in 1..99 -> println("Книга $name маленького размера")
            in 100..999 -> println("Книга $name среднего размера")
            else -> println("Книга $name большого размера")
        }
    }
    fun bookToString() : String{
        return "Книгу $name написал $autor в $year году"
    }
}