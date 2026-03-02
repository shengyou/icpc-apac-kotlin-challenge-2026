package com.jetbrains.challenge1

fun challengeResolver1(n: Int, s: String) : Boolean {
    val c = s.take(n).count { it == 'W' }
    if (c % 2 == 1) return false
    return s.take(c/2).all { it == 'W' } &&
            s.takeLast(c/2).all { it == 'R' }
}

fun main() {
    print("Enter repeat time: ")
    val repeatTime = readln().toInt()

    repeat(repeatTime) {
        print("Enter n: ")
        val n = readln().toInt()

        print("Enter s:")
        val s = readln()
        println(if (challengeResolver1(n, s)) "YES" else "NO")
    }
}
