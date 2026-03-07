import com.jetbrains.challenge1.challengeResolver1
import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.shouldBe

class ChallengeOneTests : ExpectSpec({
    context("The Ultimate Wine Tasting Event") {

        expect("enter 4 and WRRWWWRR and then return true") {
            // arrange
            val n = 4
            val s = "WRRWWWRR"

            // act
            val result = challengeResolver1(n, s)

            // assert
            result shouldBe true
        }

        expect("enter 1 and WR and then return false") {
            // arrange
            val n = 1
            val s = "WR"

            // act
            val result = challengeResolver1(n, s)

            // assert
            result shouldBe false
        }

        expect("enter 20 and WWWWRRWRRRRRWRRWRWRRWRRWWWWWWWRWWRWWRRRR and then return true") {
            // arrange
            val n = 20
            val s = "WWWWRRWRRRRRWRRWRWRRWRRWWWWWWWRWWRWWRRRR"

            // act
            val result = challengeResolver1(n, s)

            // assert
            result shouldBe true
        }

        expect("using any instead of all should fail") {
            val n = 6
            val s = "RWWRWWRRRWRR"

            val result = challengeResolver1(n, s)

            result shouldBe false
        }
    }
})
