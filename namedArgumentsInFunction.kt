// named arguments
fun main() {
    println(birthdayGreeting(name = "Nishat", age = 24))
    println("\n" + birthdayGreeting(age = 17, name = "Rizwan"))
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}