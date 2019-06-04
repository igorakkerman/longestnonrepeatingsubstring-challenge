package de.igorakkerman.kata.longestnonrepeatingsubstring

import org.assertj.core.api.Assertions.assertThat
import org.spekframework.spek2.Spek

object LongestNonRepeatingSubstringTest : Spek({
    
    group("length") {

        test("empty -> 0") {
            assertThat(LongestNonRepeatingSubstring("").length())
                    .isEqualTo(0)
        }

        test("1 char -> 1") {
            assertThat(LongestNonRepeatingSubstring("a").length())
                    .isEqualTo(1)
        }

        test("2 different -> 2") {
            assertThat(LongestNonRepeatingSubstring("ab").length())
                    .isEqualTo(2)
        }

        test("2 equal -> 1") {
            assertThat(LongestNonRepeatingSubstring("aa").length())
                    .isEqualTo(1)
        }

        test("3 different -> 3") {
            assertThat(LongestNonRepeatingSubstring("abc").length())
                    .isEqualTo(3)
        }

        test("2 equal, 1 different -> 2") {
            assertThat(LongestNonRepeatingSubstring("aab").length())
                    .isEqualTo(2)
        }

        test("1 different, 2 equal -> 2") {
            assertThat(LongestNonRepeatingSubstring("abb").length())
                    .isEqualTo(2)
        }

        test("2 different twice -> 2") {
            assertThat(LongestNonRepeatingSubstring("abab").length())
                    .isEqualTo(2)
        }

        test("abcbde -> cbde -> 4") {
            assertThat(LongestNonRepeatingSubstring("abcbde").length())
                    .isEqualTo(4)
        }

        test("abba -> ab -> 2") {
            assertThat(LongestNonRepeatingSubstring("abba").length())
                    .isEqualTo(2)
        }

        test("abbac -> bac -> 3") {
            assertThat(LongestNonRepeatingSubstring("abbac").length())
                    .isEqualTo(3)
        }

        test("dabbace -> bace -> 4") {
            assertThat(LongestNonRepeatingSubstring("dabbace").length())
                    .isEqualTo(4)
        }
    }

    group("sub") {

        test("'' -> ''") {
            assertThat(LongestNonRepeatingSubstring("").value())
                    .isEqualTo("")
        }

        test("a -> a") {
            assertThat(LongestNonRepeatingSubstring("a").value())
                    .isEqualTo("a")
        }

        test("ab -> ab") {
            assertThat(LongestNonRepeatingSubstring("ab").value())
                    .isEqualTo("ab")
        }

        test("aa -> a") {
            assertThat(LongestNonRepeatingSubstring("aa").value())
                    .isEqualTo("a")
        }

        test("aaa -> a") {
            assertThat(LongestNonRepeatingSubstring("aaa").value())
                    .isEqualTo("a")
        }

        test("abc -> abc") {
            assertThat(LongestNonRepeatingSubstring("abc").value())
                    .isEqualTo("abc")
        }

        test("aab -> ab") {
            assertThat(LongestNonRepeatingSubstring("aab").value())
                    .isEqualTo("ab")
        }

        test("abb -> ab") {
            assertThat(LongestNonRepeatingSubstring("abb").value())
                    .isEqualTo("ab")
        }

        test("abab -> ab") {
            assertThat(LongestNonRepeatingSubstring("abab").value())
                    .isEqualTo("ab")
        }

        test("abcbde -> cbde") {
            assertThat(LongestNonRepeatingSubstring("abcbde").value())
                    .isEqualTo("cbde")
        }

        test("abba -> ab") {
            assertThat(LongestNonRepeatingSubstring("abba").value())
                    .isEqualTo("ab")
        }

        test("abbac -> bac") {
            assertThat(LongestNonRepeatingSubstring("abbac").value())
                    .isEqualTo("bac")
        }

        test("dabbace -> bace") {
            assertThat(LongestNonRepeatingSubstring("dabbace").value())
                    .isEqualTo("bace")
        }
    }
})
