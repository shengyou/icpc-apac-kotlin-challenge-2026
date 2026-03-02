package com.jetbrains.challenge3

fun challengeResolver3(d: List<String>, t: String): String {
    val pt = IntArray(d.size)
    val ans = StringBuilder()
    var notFinished = d.indices.toList()
    for (tC in t) {
        for (i in notFinished) {
            while (pt[i] < d[i].length && d[i][pt[i]] != tC) {
                ans.append(d[i][pt[i]++])
            }

            if (pt[i] < d[i].length && d[i][pt[i]] == tC) {
                pt[i]++
            }
        }
        notFinished = notFinished.filter {
            pt[it] < d[it].length
        }
        if (notFinished.isEmpty()) return ans.toString()

        ans.append(tC)
    }

    return ""
}

fun main() {
    val d = List(readln().toInt()) { readln() }
    val t = readln()

    val ans = challengeResolver3(d, t)

    if (ans == "") println("NO") else println("YES\n$ans")
}
