// practice problems

// duplicate code into a function - implemented by Google
fun main() {
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}

// duplicate code into a function - implemented by myself
fun main() {
    println(weather("Ankara", 27, 31, 82))
    println(weather("Tokyo", 32, 36, 10))
    println(weather("Cape Town", 59, 64, 2))
    println(weather("Guatemala City", 50, 55, 7))
    
}

fun weather(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int): String {
    return("City: $cityName\nLow temperature: $lowTemp, High temperature: $highTemp\nChance of rain: $chanceOfRain%\n")
}

// boolean : compare two numbers - implemented by Google
fun main() {
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
    println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
    println("Have I spent more time using my phone today: ${compareTime(200, 220)}")
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

// boolean : compare two numbers - implemented by me
fun main() {
    val timeSpentToday1 = 300
    val timeSpentYesterday1 = 250
    
    println(compareTime(timeSpentToday1, timeSpentYesterday1))
    
    val timeSpentToday2 = 300
    val timeSpentYesterday2 = 300
    
    println(compareTime(timeSpentToday2, timeSpentYesterday2))
    
    val timeSpentToday3 = 200
    val timeSpentYesterday3 = 220
    
    println(compareTime(timeSpentToday3, timeSpentYesterday3))
}

fun compareTime(timeToday: Int, timeYesterday: Int): Boolean {
    if(timeToday > timeYesterday) {
        return true
    }
    else {
        return false
    }
}

// pedometer
fun main() {
    val Steps = 4000
    val caloriesBurned = pedometerStepsTocalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories") 
}

fun pedometerStepsTocalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

// default parameters : Ex-2
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId. 
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return("There's a new sign-in request on $operatingSystem for your Google Account $emailId.")
}

// default parameters : Ex-1
fun main() {
    val operatingSystem = "ChromeOS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(os: String, eId: String): String {
    return("There's a new sign-in request on $os for your Google Account $eId.")
}

// function basics
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    
    val subtractedResult = subtract(firstNumber, secondNumber)
    val anotherSubtractedResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    
    println("$firstNumber - $secondNumber = $subtractedResult")
    println("$firstNumber - $thirdNumber = $anotherSubtractedResult")
}

// Define add() function below this line
fun add(number1: Int, number2: Int): Int {
    return(number1 + number2)
}


fun subtract(number1: Int, number2: Int): Int {
    return(number1 - number2)
}

// basic math operations
fun main() {
    val firstNumber = 10
    val secondNumber = 5
//     val result = firstNumber + secondNumber		// if this line is not added, result remaining undeclared
    
    println("$firstNumber + $secondNumber = $result")
}

// message formatting
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"		// just a string (5000 + 1000), not arithmatic addition
//     val totalSalary = baseSalary + bonusAmount			// expected output (6000)
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

// string concatenation
fun main() {
    val numberOfAdults = "20" 	// need Int = 20, not String = "20"
    val numberOfKids = "30"		// need Int = 30, not String = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

// string templates error
fun main() {
    val discountPercentage: Int = 0 	
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20		// val can't be reassigned, need var
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!" 	// val can't be reassigned here
    
    println(offer)
}

// fix compiler error
fun main() {
    println("New chat message from a friend.') 	// expecting "
}

// print messages
fun main() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}
