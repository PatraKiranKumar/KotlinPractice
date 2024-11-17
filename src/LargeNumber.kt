fun main (){
    val result = LargeNumber()
    println(result)
}
 fun LargeNumber():Int
{
    val arr = arrayOf(10,20,30,40,50)
    var max = arr[0]
    for(i in arr.indices){
        if(arr[i] > max){
            max = arr[i]
        }
    }
    return max
}