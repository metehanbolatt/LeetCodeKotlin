package problems

import kotlin.math.pow

fun main() {
    println(reverse(2.0.pow(31.0).toInt()))
}

fun reverse(x: Int): Int {
    return if (x > 2.0.pow(31.0).toInt() - 1 || x < -2.0.pow(31.0).toInt()) {
        0
    } else if (x.toString().first() != '-') {
        x.toLong().toString().reversed().toInt()
    } else {
        return ((x * -1).toString().reversed().toInt()) * -1
    }
}
