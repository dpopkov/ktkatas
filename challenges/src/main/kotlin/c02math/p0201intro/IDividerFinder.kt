package learn.ktkatas.challenges.c02math.p0201intro

interface IDividerFinder {
    /**
     * Determines all real divisors of a [number]
     * (i.e., those without the number itself).
     */
    fun findDividersOf(number: Int): List<Int>
}
