import com.jetbrains.challenge3.challengeResolver3
import com.jetbrains.challenge3.challengeResolver3Dash1
import com.jetbrains.challenge3.isSubsequence
import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class ChallengeThreeTests : ExpectSpec({
    context("Mascot Naming") {

        expect("Given [porto, euc] and prague then returns a valid name") {
            // arrange
            val d = listOf("porto", "euc")
            val t = "prague"

            // act
            val result = challengeResolver3(d, t)

            // assert
            result shouldNotBe ""

            d.forEach { isSubsequence(it, result) shouldBe true }

            isSubsequence(t, result) shouldBe false
        }

        expect("Given [credit, debit, money, rich, bank, capitalism] and trap then returns a valid name") {

            val d = listOf("credit", "debit", "money", "rich", "bank", "capitalism")
            val t = "trap"

            val result = challengeResolver3(d, t)

            result shouldNotBe ""

            d.forEach { word ->
                isSubsequence(word, result) shouldBe true
            }

            isSubsequence(t, result) shouldBe false
        }

        expect("Given [axiom, choice] and io then return nothing") {

            val d = listOf("axiom", "choice")
            val t = "io"

            val result = challengeResolver3(d, t)

            result shouldBe ""
        }

        expect("Given [aaa, aab, abb, bbb] and ba then returns a valid name") {

            val d = listOf("aaa", "aab", "abb", "bbb")
            val t = "ba"

            val result = challengeResolver3(d, t)

            result shouldNotBe ""

            d.forEach { word ->
                isSubsequence(word, result) shouldBe true
            }

            isSubsequence(t, result) shouldBe false
        }
    }
})
