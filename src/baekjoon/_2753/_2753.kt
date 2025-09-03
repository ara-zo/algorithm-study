package _2753

fun main() {
    val year = readln().toInt()
    val isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    println(if (isLeap) 1 else 0)
}