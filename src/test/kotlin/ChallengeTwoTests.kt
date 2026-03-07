import com.jetbrains.challenge2.challengeResolver2
import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.shouldBe

class ChallengeTwoTests : ExpectSpec({
    context("Ads") {

        expect("Given [8, 25] and [4, 5, 18, 3, 17, 17, 18, 14] and then return 2") {
            // arrange
            val n = 8
            val k = 25
            val d = listOf(4, 5, 18, 3, 17, 17, 18, 14)

            // act
            val result = challengeResolver2(n, k, d)

            // assert
            result shouldBe 2
        }

        expect("Given [7, 21] and [20, 14, 1, 4, 20, 8, 4] and then return 2") {
            // arrange
            val n = 7
            val k = 21
            val d = listOf(20, 14, 1, 4, 20, 8, 4)

            // act
            val result = challengeResolver2(n, k, d)

            // assert
            result shouldBe 2
        }

        expect("Given [8, 1] and [20, 5, 9, 4, 14, 12, 2, 20] and then return 7") {
            // arrange
            val n = 8
            val k = 1
            val d = listOf(20, 5, 9, 4, 14, 12, 2, 20)

            // act
            val result = challengeResolver2(n, k, d)

            // assert
            result shouldBe 7
        }

        expect("Given [8, 37] and [2, 13, 13, 11, 12, 19, 16, 18] and then return 2") {
            // arrange
            val n = 8
            val k = 37
            val d = listOf(2, 13, 13, 11, 12, 19, 16, 18)

            // act
            val result = challengeResolver2(n, k, d)

            // assert
            result shouldBe 2
        }

        expect("Given [4, 38] and [15, 3, 14, 7] and then return 1") {
            // arrange
            val n = 4
            val k = 38
            val d = listOf(15, 3, 14, 7)

            // act
            val result = challengeResolver2(n, k, d)

            // assert
            result shouldBe 1
        }

        expect("single video should have no ads") {
            val n = 1
            val k = 10
            val d = listOf(5)

            challengeResolver2(n, k, d) shouldBe 0
        }

        expect("each video triggers time ad") {
            val n = 3
            val k = 10
            val d = listOf(10, 10, 10)

            challengeResolver2(n, k, d) shouldBe 2
        }

        expect("pack three videos per segment") {
            val n = 6
            val k = 100
            val d = listOf(1, 1, 1, 1, 1, 1)

            challengeResolver2(n, k, d) shouldBe 1
        }

        expect("cannot pair videos due to time") {
            val n = 3
            val k = 10
            val d = listOf(6, 6, 6)

            challengeResolver2(n, k, d) shouldBe 1
        }

        expect("break skips remaining videos") {
            val n = 5
            val k = 10
            val d = listOf(1, 2, 3, 8, 9)

            challengeResolver2(n, k, d) shouldBe 1
        }

        expect("break instead of continue fails") {
            val n = 4
            val k = 10
            val d = listOf(1, 2, 8, 9)

            challengeResolver2(n, k, d) shouldBe 1
        }

        expect("break causes early termination") {
            val n = 5
            val k = 4
            val d = listOf(1, 2, 8, 8, 8)

            challengeResolver2(n, k, d) shouldBe 2
        }
    }
})
