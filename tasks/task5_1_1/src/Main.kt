// Task 5.1.1: main program
fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: Please provide two words as command line arguments.")
        return
    }
    anagrams(args[0], args[1]).let { result ->
        if (result) {
            println("${args[0]} and ${args[1]} are anagrams.")
        } else {
            println("${args[0]} and ${args[1]} are not anagrams.")
        }
    }
    
    
    
}