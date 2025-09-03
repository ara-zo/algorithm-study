package _1330

fun main() {
    val (A, B) = readln().split(" ").map { it.toInt() }
    when {
        A > B -> println(">")
        A < B -> println("<")
        else -> println("==")
    }
}