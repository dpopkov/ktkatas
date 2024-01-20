package learn.ktkatas.challenges.c02math.p0201intro

interface IPrimeFinder {
    /**
     * Finds all prime numbers up to the specified [limit].
     */
    fun findPrimesUpTo(limit: Int): List<Int>
}
