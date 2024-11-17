fun main(){
    val arr = arrayOf(1,2,3,4,5)

    for((index,value) in arr.withIndex()){
        println("$index - $value")
    }
}