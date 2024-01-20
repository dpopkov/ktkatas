package learn.ktkatas.challenges.c02math.p0201intro.solution

import learn.ktkatas.challenges.c02math.p0201intro.IDigitsExtractor

class DigitsExtractor : IDigitsExtractor {

    override fun extract(number: Int): List<Int> {
        val result = mutableListOf<Int>()
        var remaining = number
        while (remaining > 0) {
            val digit = remaining % 10
            result.add(digit)
            remaining /= 10
        }
        return result.toList()
    }
}
