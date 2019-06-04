package de.igorakkerman.kata.longestnonrepeatingsubstring

import kotlin.math.max

class LongestNonRepeatingSubstring(private val input: String) {

    private var maxNonRepeatingCount = 0
    private var maxNonRepeatingEndIndex = -1

    private fun iterate() {
        val lastSeen: MutableMap<Char, Int> = HashMap()
        var currentFirstNonRepeatingIndex = 0

        for (index in (0 until input.length)) {

            val char = input[index]

            if (lastSeen.containsKey(char))
                currentFirstNonRepeatingIndex = max(currentFirstNonRepeatingIndex, lastSeen[char]!! + 1)

            lastSeen[char] = index

            val currentNonRepeatingCount = index - currentFirstNonRepeatingIndex + 1
            if (currentNonRepeatingCount > maxNonRepeatingCount) {
                maxNonRepeatingCount = currentNonRepeatingCount
                maxNonRepeatingEndIndex = index
            }
        }
    }

    fun length(): Int {
        iterate()

        return maxNonRepeatingCount
    }

    fun value(): String {
        iterate()

        return input.substring(maxNonRepeatingEndIndex - maxNonRepeatingCount + 1, maxNonRepeatingEndIndex + 1)
    }
}
