// default arguments
fun main() {
    println(birthdayGreeting(age = 24))
    println("\n" + birthdayGreeting(age = 17, name = "Rizwan"))
}

fun birthdayGreeting(name: String = "Nishat", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}