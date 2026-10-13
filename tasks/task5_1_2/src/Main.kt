// Task 5.1.2: main program
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Please provide a number of sides for the die as a command line argument.")
        return
    }
    rollDie(args[0].toInt())
    
}