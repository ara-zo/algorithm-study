package _2588

fun main() {
    val a = readln().toInt()
    val b = readln()

    b.reversed().forEach { println(a * it.digitToInt()) }
    println(a * b.toInt())
}