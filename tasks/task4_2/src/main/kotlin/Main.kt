// Task 4.2: use of if and ranges

fun main() {
    println("Pizza Menu:\n a) Margherita\n b) Pepperoni\n c)BBQ\n d) Vegetarian\n Choose your pizza (a-d):")
    val userchoice = readln().lowercase()
    if (userchoice[0] in 'a'..'d' && userchoice.length == 1) {
        println("Order accepted")
    } else {
        println("Invalid choice!") }
}