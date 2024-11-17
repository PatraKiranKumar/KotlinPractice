import java.util.*
import kotlin.math.pow

fun main() {
    val result = add(8,9)
    println(result)
    val result1 = substarct(8,9)
    println(result1)
    val fn = ::power
    println(fn(2.0,4.0))

}
fun add(parameter1:Int,parameter2:Int):Int
{
    val sum = parameter1 + parameter2
    return sum
}
fun substarct(num1:Int,num2:Int):Int {
    return num1 - num2
}
fun power(a:Double,b:Double):Double
{
    return a.pow(b)
}
