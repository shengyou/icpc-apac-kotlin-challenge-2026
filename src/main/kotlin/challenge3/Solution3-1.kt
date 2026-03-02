package com.jetbrains.challenge3

fun challengeResolver3Dash1(d: List<String>, t: String): String {
    val pt = IntArray(d.size)
    val ans = StringBuilder()
    t.forEach { tC ->
        d.forEachIndexed { i, s ->
            while (pt[i] < s.length && s[pt[i]] != tC) {
                ans.append(s[pt[i]])
                pt[i]++
            }
            if (pt[i] < s.length && s[pt[i]] == tC) {
                pt[i]++
            }
        }
        val finished = d.indices.all { pt[it] >= d[it].length }
        if (finished) {
            return ans.toString()
        }
        ans.append(tC)
    }

    return ""
}
