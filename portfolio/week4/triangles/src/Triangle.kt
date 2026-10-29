// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double){
    init {
        if (isValidTriangle(sideA, sideB, sideC) == false){
            throw IllegalArgumentException()
        }
    }
    
    fun isValidTriangle(sideA: Double, sideB: Double, sideC: Double): Boolean{
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)
    }
    
    val perimeter : Double
        get() = sideA + sideB + sideC
        
    val semiPerimeter : Double
        get() = perimeter / 2
    
    
    val area : Double 
        get() = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)"
    }
    
}
