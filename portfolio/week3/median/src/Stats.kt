// Task 7.7.1: statistics functions
fun median(myList: List<Double>) : Double{
    if (myList.size == 0) {
        throw IllegalArgumentException()
    }
    else{
    val ascList = myList.sorted()
    val listSize = ascList.size
    if (listSize % 2 == 0){
        val position1 = listSize/2
        val position2 = position1 - 1
        return (ascList[position1] + ascList[position2])/2
    }
    else{
        val position = listSize/2
        return ascList[position]
    }
}
}

fun stats(myList: List<Double>) {
    val minimum = myList.minOrNull()
    val maximum = myList.maxOrNull()
    val mean = myList.average()
    val median = median(myList)
    println("Minimum: $minimum, Maximum: $maximum, Mean: $mean, Median: $median")
}