/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    return array.withIndex().map { (i, x) ->
        if (array.withIndex().count { (index, word) -> index < i && word == x } != 0) "blahblah"
        else x
    }
}


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    return text.split(" ").toSet().size
}

fun main() {
    val text = "My name name is Nikita Nikita Nazarov a a b"
    println(uniqueWords(text))

    // Вызвать для text и вывести результат замены на экран
    val replacedText = replaceElements(text.split(" ").toList())
    println(replacedText)
}