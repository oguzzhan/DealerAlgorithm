import kotlin.math.roundToInt
import kotlin.math.sqrt

class Coordinate(var x: Double, var y: Double) {


    companion object {
        //calculate distance between two point with x y values
        @JvmStatic
        fun calculateDistanceBetweenPoints(
            coordinate1: Coordinate,
            coordinate2: Coordinate
        ): Int {
            val x1: Double = coordinate1.x
            val y1: Double = coordinate1.y
            val x2: Double = coordinate2.x
            val y2: Double = coordinate2.y
            //distance is multiplied because  return to the factory
            return sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)).roundToInt() * 2
        }
    }
}