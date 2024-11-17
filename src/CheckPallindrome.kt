fun main(){
     val str = "malayalam"
    println(str)
    val length = str.length-1

    var reverse_str = ""
    for(i in length downTo 0) {
        reverse_str = reverse_str + str[i]
    }
    println(reverse_str)
    if(reverse_str==str){
        println("it is a pallindrome")
    }
    else
    {
        println("it is not a pallindrome")
    }
}