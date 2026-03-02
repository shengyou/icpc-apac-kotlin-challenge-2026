package com.jetbrains.challenge2

fun main() {
    repeat(readln().toInt()) {
        val (n, k) = readInts()
        val d = readInts().sorted()
        val u = BooleanArray(n)
        var pt3 = n - 1
        var pt2 = n - 1
        var ans = 0

        for (i in d.indices) {
            if (u[i]) break

            u[i] = true
            ans++

            while (pt2 > i && (u[pt2] || d[i] + d[pt2] >= k)) {
                pt2--
            }
            u[pt2] = true

            if (d[i] < k) {
                while (pt3 > i && u[pt3]) pt3--
                u[pt3] = true
            }
        }

        println(ans - 1)
    }
}
