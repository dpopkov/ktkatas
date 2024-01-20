package learn.ktkatas.challenges.c02math.p0201intro

interface IDigitsExtractor {
    /**
     * Extracts the digits of a [number] from right to left.
     */
    fun extract(number: Int): List<Int>
}