package learn.ktkatas.challenges.c02math.p0202exercises

/*
A natural number is called a perfect number if its values is equal
to the sum of its real divisors. For example: 1+2+3=6
 */
interface IEx3PerfectNumbers {
    /**
     * Вычисляет список совершенных (perfect) чисел до [maximum] значения.
     */
    fun calcPerfectNumbers(maximum: Int): List<Int>
}
