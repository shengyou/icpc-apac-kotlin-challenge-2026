package com.jetbrains.challenge2

fun challengeResolver2(n: Int, k: Int, d: List<Int>): Int {
    val sortedD = d.sorted()
    val u = BooleanArray(n)
    var pt3 = n - 1
    var pt2 = n - 1
    var ans = 0

    for (i in sortedD.indices) {
        if (u[i]) continue

        u[i] = true
        ans++

        while (pt2 > i && (u[pt2] || sortedD[i] + sortedD[pt2] >= k)) {
            pt2--
        }
        u[pt2] = true

        if (sortedD[i] < k) {
            while (pt3 > i && u[pt3]) pt3--
            u[pt3] = true
        }
    }

    return (ans - 1)
}

fun main() {
    print("Enter repeat time: ")
    val repeatTime = readln().toInt()

    repeat(repeatTime) {
        val (n, k) = readInts()
        val d = readInts()
        println(challengeResolver2(n, k, d))
    }
}
