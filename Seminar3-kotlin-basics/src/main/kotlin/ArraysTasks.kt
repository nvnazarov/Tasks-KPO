
/**
    Задание 1: Сформировать целочисленный массив A из N элементов
    при помощи ввода значений с клавиатуры (N вводит пользователь).
    Вывести массив на экран. (1 балл)
 */
fun makeArray(): Array<Int> {
    val size = readln().toInt()
    var array = Array<Int>(0) { 0 }
    for (i in 1..size) {
        array += readln().toInt()
    }
    return array
}

/**
    Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
    Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: Array<Int>) {
    return arr.sortDescending()
}

fun main() {
    val arr = makeArray()
    sortArrayDesc(arr)
    println(arr.joinToString(", "))
}

