fun main()
{
  val arr = arrayOf(1,2,3,4,5,6)
  var sum =0
  for(i in arr.indices)
  {
      sum = sum + arr[i]
  }
    println(sum)
}
