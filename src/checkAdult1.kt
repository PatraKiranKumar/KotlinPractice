class checkAdult1(val name: String, var age: Int) {
    fun canVote(): Boolean {
        return age >= 18
    }
}

fun main() {
    val p1 = checkAdult1("Kiran", 24)
    val p2 = checkAdult1("Kishan", 17)

    println(p1.canVote())
    println(p2.canVote())
}