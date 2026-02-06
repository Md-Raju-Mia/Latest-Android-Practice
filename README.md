# Kotlin
**var vs val:**  
If you need to update the value of a variable, declare the variable with the Kotlin keyword var, instead of val.  
  
- val keyword - Use when you expect the variable value will not change.  
- var keyword - Use when you expect the variable value can change.  

# Empty Project Jetpack Compose
**onCreate():**  
The onCreate() function is the entry point to this Android app and calls other functions to build the user interface.

**setContent():**  
The setContent() function within the onCreate() function is used to define your layout through composable functions.
                  All functions marked with the @Composable annotation can be called from the setContent() function or from other Composable functions.
                  The annotation tells the Kotlin compiler that this function is used by Jetpack Compose to generate the UI.

**Surface:**  
To set a different background color for your introduction, you'll need to surround your text with a Surface.
 A Surface is a container that represents a section of UI where you can alter the appearance, such as the background color or border.
                
**There are a few differences with functions & composable functions.**  
  1. The @Composable annotation before the function.
  2. @Composable function names are capitalized.
  3. @Composable functions can't return anything.


# The @Preview annotation tells Android Studio that this composable should be shown in the design view of this file.  
@Preview(showBackground = true)  
@Composable  
fun GreetingPreview() {  
    GreetingCardTheme {  
        Greeting("Raju")  
    }  
}  

 **imports organize**  
 In your code, the best practice is to keep your imports listed alphabetically and remove unused imports.
 To do this press Help on the top toolbar, type in optimize imports, and click on Optimize Imports.

**Add some space (padding) around the text.**  
 A Modifier is used to augment or decorate a composable.
 One modifier you can use is the padding modifier, which adds space around the element
 (in this case, adding space around the text). This is accomplished by using the Modifier.padding() function.
 Every composable should have an optional parameter of the type Modifier. This should be the first optional parameter.

# QUIZ  

**a. What does IDE stand for?**  
    ans: Integrated Development Environment
    
 **b. Which of the following are advantages of using Android Studio?**  
    ans: It can help prevent typos and other mistakes in your code.
         It comes with a virtual device called an emulator that can run your app.
         It can show you a real-time preview of how your app will look on-screen while you code.
         
 **c. What is the purpose of using a virtual device, or emulator, in Android Studio?**  
    ans: To test your app on a device without having that physical device

 **d. In Android Studio, what is a project template good for?**  
    ans: It makes getting started on building a new app faster.
         It provides a structure that follows best practices.
         It makes building a new app less error-prone by pre-populating the project with some app code.
         
 **e. How do you create a new project in Android Studio?**  
    ans: If you have a project already open, select File > New > New Project from the Android Studio menu.
         In the “Welcome to Android Studio” window, click “Start a new Android Studio project.”
         
 **f. Which of the following is true about Compose?**  
    ans: The Empty Compose Activity template is used to create a simple app.
         Layouts can be viewed in the Preview window, without actually running your app.
         Themes, such as GreetingCardTheme allow you to style Composables.
         
 **g. A Compose function requires the @Composable annotation.**  
    ans: True


# QUIZ
**1. What is Jetpack Compose?**  
ans: A Modern toolkit to develop Android UI

**2. Composable functions are the basic building block of Compose.**  
ans: True

**3. What annotation is used to annotate a Composable function?**  
ans: @Composable

**4. The basic standard layout elements in Compose are:**  
ans: Column, Row, Box

**5. What is the tool window for importing, creating, managing, and using resources in your app?**  
ans: Resource Manager

**6. Which class is an automatically generated class by Android that contains the IDs of all resources in the project.**  
ans: The R Class

**7. Which function is used is to load a drawable image resource.**  
ans: The painterResource() function

**8. What is the function parameter used to add accessibility text, used by talkback?**  
ans: contentDescription

**9. The Box layout stacks the UI elements on top of one another.**  
ans: True

**10. What parameter is used to align the child element to the beginning of the parent?**  
ans: Alignment.Start







/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
//1. Print messages

/*fun main() {
	val message1 = "Use the val keyword when the value doesn't change."
  
    val message2 = "Use the var keyword when the value can change."
    
    val message3 = "When you define a function, you define the parameters that can be passed to it."
    
    val message4 = "When you call a function, you pass arguments for the parameters."
    
    println("$message1\n$message2\n$message3\n$message4")
}*/



/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
// 2. Fix compile error

/*fun main() { 
    println("New chat message from a friend")
}*/



/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
// 3. String templates

// fun main() {
//     var discountPercentage: Int = 0
//     var offer: String = ""
//     val item = "Google Chromecast"
//     discountPercentage = 20
//     offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
//     println(offer)
// }

/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

// 4. String concatenation
/*fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}*/

/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

//5. Message formatting
/*fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}*/



/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
//6. Implement basic math operations

/*fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    
    println("$firstNumber + $secondNumber = $result")
}*/

/*fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
fun add(NumberOne: Int, NumberTwo: Int): Int {
    val result = NumberOne + NumberTwo
    return result
}*/

/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
//7. Default parameters

/*fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.

fun displayAlertMessage(operatingSystem: String,emailId: String ): String{
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId"
}*/



/*fun main() {
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

fun displayAlertMessage(operatingSystem: String ="Unknown OS", emailId: String ): String{
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId"
}*/

/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
//8. Pedometer



/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
//8. Move duplicate code into a function

fun main() {
    
    val CityName1 = "Ankara"
    val CityLowTemperature1 = 27
    val CityHighTemperature1 = 31
    val ChanceOfRain1 = 82
    
    println(CityInfo(CityName1, CityLowTemperature1, CityHighTemperature1,ChanceOfRain1))
    println()
    
    val CityName2 = "Tokyo"
    val CityLowTemperature2 = 32
    val CityHighTemperature2 = 36
    val ChanceOfRain2 = 10
    
    println(CityInfo(CityName2, CityLowTemperature2, CityHighTemperature2, ChanceOfRain2))
    println()
    
    val CityName3 = "Cape Town"
    val CityLowTemperature3 = 32
    val CityHighTemperature3 = 36
    val ChanceOfRain3 = 10
    
    println(CityInfo(CityName3, CityLowTemperature3, CityHighTemperature3, ChanceOfRain3))
    println()
    
	val CityName4 = "Guatemala City"
    val CityLowTemperature4 = 50
    val CityHighTemperature4 = 55
    val ChanceOfRain4 = 7
    
    println(CityInfo(CityName4, CityLowTemperature4, CityHighTemperature4, ChanceOfRain4))
    println()
    
}

fun CityInfo(CityName: String, CityLowTemparature: Int, CityHighTemparature: Int, CityChanceOfRain: Int): String{
    
    val CityName = "City: $CityName"
    val CityTemperature = "Low temperature: $CityLowTemparature, High temperature: $CityHighTemparature"
    val ChanceOfRain = "Chance of rain: $CityChanceOfRain"+"%"
   	
    return "$CityName\n$CityTemperature\n$ChanceOfRain"
    
}





