package learn.ktkatas.challenges.c02math.p0202exercises

interface IEx4PrimeNumbers {
    /**
     * Вычисляет все простые числа вплоть до заданного значения [limit] включительно.
     */
    fun calcPrimesUpTo(limit: Int): List<Int>
}
