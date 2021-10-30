

// Variables outside of the main function are top level variables
val name: String = "Joe" // A val cannot be reassigned later on
var currentLocation: String? = "United Kingdom" // A var can be reassigned later on

fun main() {
    println("Hello Kotlin")
    println(name + " from " + currentLocation)
}