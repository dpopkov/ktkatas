package learn.ktkatas.challenges.c02math.p0202exercises.solution

import learn.ktkatas.challenges.c02math.p0202exercises.IEx5PrimeNumbersPairs

class Ex5PrimeNumbersPairs : IEx5PrimeNumbersPairs {
    override fun computeAllPairsOfPrimes(limit: Int, distance: Int): List<Pair<Int, Int>> {
        val isPrime = BooleanArray(limit + distance) { true }
        for (i in 0..(isPrime.lastIndex / 2)) {
            if (isPrime[i]) {
                val prime = i + 2
                for (j in (i + prime)..isPrime.lastIndex step prime) {
                    isPrime[j] = false
                }
            }
        }
        return buildList {
            for (i in 0..(isPrime.lastIndex - distance)) {
                if (isPrime[i] && isPrime[i + distance]) {
                    add((i + 2) to (i + 2 + distance))
                }
            }
        }
    }

    fun naiveSolution(limit: Int, distance: Int): List<Pair<Int, Int>> {
        val pn = Ex4PrimeNumbers().calcPrimesUpTo(limit + distance)
        val r = buildList<Pair<Int, Int>> {
            for (i in 0..<pn.lastIndex) {
                val p1 = pn[i]
                val p2 = p1 + distance
                if (p2 in pn) {
                    add(p1 to p2)
                }
            }
        }
        return r
    }
}
