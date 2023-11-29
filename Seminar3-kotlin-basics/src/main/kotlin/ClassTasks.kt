/**
 * Задание 1: Объявите классы Circle и Square – наследников базового (Point).
 * Реализуйте readonly свойство, вычисляющее площадь каждой фигуры, а также функцию display()
 * для вывода информации о фигуре на экран.
 *
 * (3 балла)
 */

open class Point(val x: Double, val y: Double) {
    open val area: Double = 0.0

    open fun display() {
        println("[Point]: S = $area, X = $x, Y = $y")
    }
}

class Circle(x: Double, y: Double, private val radius: Double) : Point(x, y) {
    override val area = kotlin.math.PI * radius * radius

    override fun display() {
        println("[Circle]: S = $area, CenterX = $x, CenterY = $y, Radius = $radius")
    }
}

class Square(x: Double, y: Double, private val side: Double) : Point(x, y) {
    override val area = side * side

    override fun display() {
        println("[Square]: S = $area, CenterX = $x, CenterY = $y, Side = $side")
    }
}

fun main() {
    val p = Point(34.0, 56.0)
    val c = Circle(46.0, 34.0, 7.0)
    val s = Square(46.0, 34.0, 8.0)
    p.display()
    c.display()
    s.display()
}
