/**
    Задание 1: Функция, спрашивающая у пользователя его ФИО и выводящая его на экране.
    (0.5 балла)
    Формат вывода:
        " Фамилия:
          Имя:
          Отчество:
        "
 */
fun askForInput() {
    print("Введите Ваши ФИО: ")
    val fullName = readln().trim()
    val nameParts = fullName.split(" ")
    if (nameParts.size != 3) {
        println("Похоже Ваши ФИО не соответствуют шаблону <Фамилия Имя Отчество>.")
    } else {
        println("Фамилия: ${nameParts[0]} \nИмя: ${nameParts[1]}\nОтчество: ${nameParts[2]}")
    }
}

/**
    Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double?, Double?> {
    val d = b * b - 4 * a * c
    if (d < 0) {
        return (null to null)
    }
    val dSqrt = kotlin.math.sqrt(d)
    return (-b - dSqrt) / 2 to (-b + dSqrt) / 2
}

/**
    Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
    (2 балла)
 */
fun printSameDigitNumbers() {
    val sameDigitNumbers = Array<Int>(9) { i -> (100 * i+ 10 * i + i + 111) }
    println(sameDigitNumbers.joinToString(", "))
}

fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first}; X2 = ${roots.second}")

    printSameDigitNumbers()
}
