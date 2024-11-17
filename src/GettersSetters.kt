fun main(){
    val p1 = person("kiran",24)
    println(p1.name)
    println(p1.age)
    p1.age = -2
}
class person(name : String ,age :Int)
{
 var name = name
     get() {
         println("name gretter is called")
         return field.toUpperCase()
     }
 var age = age

     set(value) {
         if(value>0){
             field = value
         }
         else{
             println("age cant be zero")
         }
     }
}