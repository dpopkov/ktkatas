package learn.ktkatas.challenges.c02math.p0202exercises

interface IEx1bStatistics {
    /**
     * Найти количество и сумму натуральных чисел, которые делятся на 2 или 7
     * вплоть до заданного максимального значения [maximum], не включая его.
     */
    fun calcCountAndSumAllNumbersDivBy2Or7(maximum: Int): Pair<Int, Int>
}
