// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: Please provide three marks as command line arguments.")
        return
    }

    val mark1 = args[0].toInt()
    val mark2 = args[1].toInt()
    val mark3 = args[2].toInt()

    val average = (mark1 + mark2 + mark3) / 3.0
    val roundedAverage = average.roundToInt()
    
    val grade = when (roundedAverage) {
        in 70..100 -> "Distinction"
        in 40..69 -> "Pass"
        in 0..39 -> "Fail"
        else -> "Invalid marks"
    }

    println("Grade: $grade\n Average: $roundedAverage")
    }