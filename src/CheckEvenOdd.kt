fun CheckEvenOdd(number:Int){
//    if(number%2 ==0){
//        println("it is a even number")
//    }else{
//        println("it is a odd number")
//    }

//    for one line of statement it is  a short method to use
    val result = if(number%2==0)"even" else "odd"
    println(result)
}
fun main(){

    CheckEvenOdd(-2)

    CheckEvenOdd(-100)

    CheckEvenOdd(100)
}
