package learn.ktkatas.challenges.c02math.p0202exercises

interface IEx5PrimeNumbersPairs {
    /**
     * Вычислить все пары простых чисел до указанного [limit] для первого числа пары,
     * с указанной [distance] между числами каждой пары.
     */
    fun computeAllPairsOfPrimes(limit: Int, distance: Int): List<Pair<Int, Int>>
}
