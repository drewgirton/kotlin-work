// Task 4.7: finding the longest line in a file

import java.nio.file.Path
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Please provide a single file name as a command line argument.")
        exitProcess(1)
    }

    val filePath = Path.of(args[0])

    var lineNumber = 0
    var longestLineNumber = 0
    var longestLineLength = 0

    filePath.toFile().forEachLine { line ->
        lineNumber++

        if (line.length > longestLineLength) {
            longestLineLength = line.length
            longestLineNumber = lineNumber
        }
    }

    println("Line $longestLineNumber is the longest (length = $longestLineLength)")
}
