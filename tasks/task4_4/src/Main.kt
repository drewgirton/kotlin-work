// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: Please provide three temperatures as command line arguments.")
        exitProcess(1)
    }
    var initialTemp = args[0].toDouble()
    val maxTemp = args[1].toDouble()
    val tempIncrement = args[2].toDouble()
    
    println("%10s %12s".format("Celsius", "Fahrenheit"))
    
    while (initialTemp <= maxTemp) {
        val celsius = initialTemp
        val fahrenheit = (celsius * 9 / 5) + 32
        println("%10.1f %12.1f".format(celsius, fahrenheit))
        initialTemp += tempIncrement
    }
}
