package learn.ktkatas.challenges.c02math.p0201intro.solution

import learn.ktkatas.challenges.c02math.p0201intro.IPrimeFinder

class PrimeFinderNaive : IPrimeFinder {
    override fun findPrimesUpTo(limit: Int): List<Int> {
        val result = mutableListOf<Int>()
        val checker = PrimeCheckerSimple()
        for (n in 2..limit) {
            if (checker.isPrime(n)) {
                result.add(n)
            }
        }
        return result
    }
}
