import com.jetbrains.challenge3.isSubsequence
import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.shouldBe

class ChallengeThreeValidatorTests : ExpectSpec({
    context("Test Chanllenge 3 Validator") {

        expect("isSubsequence returns true for an exact match") {
            val x = "abc"
            val y = "axbycz"

            val result = isSubsequence(x, y)

            result shouldBe true
        }

        expect("isSubsequence returns true when x is a proper subsequence of y") {
            val x = "ace"
            val y = "abcde"

            val result = isSubsequence(x, y)

            result shouldBe true
        }

        expect("isSubsequence returns false when x is not a subsequence of y due to ordering") {
            val x = "abc"
            val y = "acbxyz"

            val result = isSubsequence(x, y)

            result shouldBe false
        }

        expect("isSubsequence returns false when x is longer than y") {
            val x = "abcdef"
            val y = "abc"

            val result = isSubsequence(x, y)

            result shouldBe false
        }

        expect("isSubsequence returns true for empty string x") {
            val x = ""
            val y = "abc"

            val result = isSubsequence(x, y)

            result shouldBe true
        }

        expect("isSubsequence returns true for both x and y being empty strings") {
            val x = ""
            val y = ""

            val result = isSubsequence(x, y)

            result shouldBe true
        }

        expect("isSubsequence returns false for x not being a substring of y") {
            val x = "xyz"
            val y = "abc"

            val result = isSubsequence(x, y)

            result shouldBe false
        }

        expect("isSubsequence returns true for single character x in y") {
            val x = "a"
            val y = "abc"

            val result = isSubsequence(x, y)

            result shouldBe true
        }

        expect("isSubsequence returns false for single character x not in y") {
            val x = "z"
            val y = "abc"

            val result = isSubsequence(x, y)

            result shouldBe false
        }

        expect("isSubsequence returns true for repeated characters in x and y") {
            val x = "aaa"
            val y = "aaaaaa"

            val result = isSubsequence(x, y)

            result shouldBe true
        }

        expect("isSubsequence returns false when x has repeated characters not matching y") {
            val x = "aaa"
            val y = "aabb"

            val result = isSubsequence(x, y)

            result shouldBe false
        }
    }
})
