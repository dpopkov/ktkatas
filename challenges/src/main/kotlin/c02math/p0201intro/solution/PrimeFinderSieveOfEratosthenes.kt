package learn.ktkatas.challenges.c02math.p0201intro.solution

import learn.ktkatas.challenges.c02math.p0201intro.IPrimeFinder

class PrimeFinderSieveOfEratosthenes : IPrimeFinder {
    override fun findPrimesUpTo(limit: Int): List<Int> {
        val candidates: MutableList<Int?> = MutableList(
            size = limit - 1
        ) { it + 2 }
        var i = 0
        // todo: optimize maximum index
        while (i < candidates.size) {
            while (i < candidates.size && candidates[i] == null) {
                i++
            }
            if (i < candidates.size) {
                val prime: Int = candidates[i]!!
                for (j in (i + prime)..<candidates.size step prime) {
                    candidates[j] = null
                }
                i++
            }
        }
        return candidates.filterNotNull()
    }
}
