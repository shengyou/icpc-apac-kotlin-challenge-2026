package com.jetbrains.challenge3

fun isSubsequence(x: String, y: String): Boolean {
    var i = 0
    for (c in y) {
        if (i < x.length && x[i] == c) i++
    }
    return i == x.length
}
