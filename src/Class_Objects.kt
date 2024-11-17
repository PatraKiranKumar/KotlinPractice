fun main()
{
    val Nexon = car("Tata","Nexon","Petrol",7600)
    val Thar = car("Mahindra","Thar","Diesel",9600)


    Thar.ApplyBrake()
    println(Nexon.drive())
}
class car(val Brand:String,val name:String,val type:String,var kmRan:Int) //properties
{
    fun drive() // Methods/functions
    {
       println(" $name Car is driving")
    }
    fun ApplyBrake()
    {
        println(" $name Brake is applied")

    }
}