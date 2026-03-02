package com.jetbrains.challenge3

fun main() {
    val d = List(readln().toInt()) { readln() }
    val t = readln()
    val pt = IntArray(d.size)
    val ans = StringBuilder()
    var notFinished = d.indices.toList()
    for (tC in t) {
        for (i in notFinished) {
            while (pt[i] < d[i].length && d[i][pt[i]] != tC) {
                ans.append(d[i][pt[i]++])
            }
        }
        notFinished = notFinished.filter {
            pt[it] < d[it].length
        }
        if (notFinished.isEmpty()) return println("YES\n$ans")
        ans.append(tC)
    }
    println("NO")
}
