// multiple parameters of function
fun main() {
    println(birthdayGreeting("Nishat", 24))
    println("\n" + birthdayGreeting("Rizwan", 17))
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}