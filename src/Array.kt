
fun main(){
    val arr = arrayOf(1,2,5,4,6)
//    for get an element
    println("getting an element"+ arr.get(2))

//    for set an element
    arr.set(0,3)
//    for get an array size
    println(arr.size)
    println(arr.get(0))
//    to print an array we need a for loop

    for(i in arr.indices){
        println(arr[i])
    }

}
