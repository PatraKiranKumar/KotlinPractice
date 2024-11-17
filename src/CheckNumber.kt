import java.util.*
fun main() {
    val number=-1
   CheckNumber(number)
}
fun CheckNumber(number:Int){
//    val scanner = Scanner(System.`in`)
//
//    println("enter a number :")
//    val number = scanner.nextInt()

    if(number>0){
        println("positive number")
    }else if(number<0){
        println("negative number")
    }else{
        println("the number is zero")
    }
}