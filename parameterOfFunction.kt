// parameter of function
fun main() {
    println(birthdayGreeting("Nishat"))
    println("\n" + birthdayGreeting("Mahmud"))
}

fun birthdayGreeting(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 22 years old!"
    return "$nameGreeting\n$ageGreeting"
}