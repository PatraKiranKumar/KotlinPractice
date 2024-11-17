fun LinearSearch(target:Int)
{
    val arr = arrayOf(1,3,4,6,8,9)
    for(i in arr.indices) {
        if (arr[i] == target){
            println("target found at index $i ")
        }
    }
}
fun main()
{
   LinearSearch(8)
}