package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {  /**The onCreate() function is the entry point to this Android app and calls other functions to build the user interface.*/
        super.onCreate(savedInstanceState)
        setContent {  /**The setContent() function within the onCreate() function is used to define your layout through composable functions.
                        All functions marked with the @Composable annotation can be called from the setContent() function or from other Composable functions.
                        The annotation tells the Kotlin compiler that this function is used by Jetpack Compose to generate the UI.*/
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

/**
There are a few differences with functions & composable functions.
1. The @Composable annotation before the function.
2. @Composable function names are capitalized.
3. @Composable functions can't return anything.
 */


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan) {
        Text(
            text = "Hi, my name is $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}

/**
The @Preview annotation tells Android Studio that this composable should be shown in the design view of this file.
 */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Raju")
    }
}

/**
 5. Change the background color
 To set a different background color for your introduction, you'll need to surround your text with a Surface.
 A Surface is a container that represents a section of UI where you can alter the appearance, such as the background color or border.

 6. imports organize Tips
 In your code, the best practice is to keep your imports listed alphabetically and remove unused imports.
 To do this press Help on the top toolbar, type in optimize imports, and click on Optimize Imports.

 7. Add some space (padding) around the text.
 A Modifier is used to augment or decorate a composable.
 One modifier you can use is the padding modifier, which adds space around the element
 (in this case, adding space around the text). This is accomplished by using the Modifier.padding() function.
 Every composable should have an optional parameter of the type Modifier. This should be the first optional parameter.

 8. QUIZ
 a. What does IDE stand for?
    ans: Integrated Development Environment
 b. Which of the following are advantages of using Android Studio?
    ans: It can help prevent typos and other mistakes in your code.
         It comes with a virtual device called an emulator that can run your app.
         It can show you a real-time preview of how your app will look on-screen while you code.
 c. What is the purpose of using a virtual device, or emulator, in Android Studio?
    ans: To test your app on a device without having that physical device

 d. In Android Studio, what is a project template good for?
    ans: It makes getting started on building a new app faster.
         It provides a structure that follows best practices.
         It makes building a new app less error-prone by pre-populating the project with some app code.
 e. How do you create a new project in Android Studio?
    ans: If you have a project already open, select File > New > New Project from the Android Studio menu.
         In the “Welcome to Android Studio” window, click “Start a new Android Studio project.”
 f. Which of the following is true about Compose?
    ans: The Empty Compose Activity template is used to create a simple app.
         Layouts can be viewed in the Preview window, without actually running your app.
         Themes, such as GreetingCardTheme allow you to style Composables.
 g. A Compose function requires the @Composable annotation.
    ans: True
 */