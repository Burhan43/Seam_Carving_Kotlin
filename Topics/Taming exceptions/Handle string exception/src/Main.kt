fun main() {
    val index = readLine()!!.toInt()
    val word = readLine()!!
    val size=word.length

    if((index !in 0 until size))
    {
        println("There isn't such an element in the given string, please fix the index!")
        return

    }
    else{ println(word[index])}
}
