// returning a value to function
fun main() {
    val greeting = birthdayGreeting()
    println(greeting)
//     println(birthdayGreeting())
}

fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Nishat!"
    val ageGreeting = "You are now 22 years old!"
    return "$nameGreeting\n$ageGreeting"
}