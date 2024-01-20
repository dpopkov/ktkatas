package learn.ktkatas.challenges.c02math.p0201intro.solution

import learn.ktkatas.challenges.c02math.p0201intro.IDividerFinder

class DividerFinder : IDividerFinder {
    override fun findDividersOf(number: Int): List<Int> {
        val result = mutableListOf<Int>()
        for (n in 1..(number / 2)) {
            if (number % n == 0) {
                result.add(n)
            }
        }
        return result
    }
}
