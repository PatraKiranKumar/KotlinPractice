fun main(){
    val arr = arrayOf("one","two","three")
    val target = "three"
    for(i in arr.indices){
        if(arr[i].equals(target)){

            println("target found at index $i")
    }

        }
    }
