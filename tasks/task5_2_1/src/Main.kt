// Task 5.2.1: main program
fun main(args: Array<String>){
    if (args.size != 1) {
        println("Error: Please provide a radius as a command line argument.")
        return
    }
    val radius = args[0].toDouble()
    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)
    println("Area = %.4f, Perimeter = %.4f".format(area, perimeter))
}