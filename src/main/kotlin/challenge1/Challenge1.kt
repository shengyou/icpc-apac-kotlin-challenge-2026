package com.jetbrains.challenge1

fun solve() : Boolean {
    val n = readln().toInt()
    val s = readln()
    val c = s.take(n).count { it == 'W' }
    if (c % 2 == 1) return false
    return s.take(c/2).any { it == 'W' } &&
            s.takeLast(c/2).any { it == 'R' }
}

fun main() {
    repeat(readln().toInt()) {
        println(if (solve()) "YES" else "NO")
    }
}
