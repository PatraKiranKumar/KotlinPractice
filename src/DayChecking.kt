import java.util.*
fun DayChecking(){
    val scanner = Scanner(System.`in`)

    println("enter a day")
    var day = scanner.next()
    day = day.lowercase()

    when(day){
        "monday" -> println("Hello user happy monday")
        "tuesday" -> println("Hello user happy tuesday")
        "wednesday" -> println("Hello user happy wednesday")
        "thursday" -> println("Hello user happy thursday")
        "friday" -> println("Hello user happy friday")
        "saturday" ->println("Hello user happy saturday")
        "sunday" ->println("Hello user happy sunday")
        else -> println("Invalid Day")
    }
}
fun main(){
  DayChecking()
}