package learn.ktkatas.challenges.c02math.p0202exercises.solution

import learn.ktkatas.challenges.c02math.p0202exercises.IEx4PrimeNumbers

class Ex4PrimeNumbers : IEx4PrimeNumbers {

    override fun calcPrimesUpTo(limit: Int): List<Int> {
        val potentialPrimes = Array(limit - 1) { true }
        for (i in 0..((limit - 1) / 2)) {
            if (potentialPrimes[i]) {
                val primeValue = i + 2
                for (j in (i + primeValue)..potentialPrimes.lastIndex step primeValue) {
                    potentialPrimes[j] = false
                }
            }
        }
        return potentialPrimes
            .mapIndexedNotNull { index, isPrime ->
                if (isPrime) index + 2
                else null
            }.toList()
    }

    // Первоначальный вариант с числами вместо boolean
    /*override*/ fun calcPrimesUpTo1(limit: Int): List<Int> {
        val potentialPrimes = Array<Int?>(limit) { it + 2 }
        for (i in 0..(potentialPrimes.size / 2)) {
            if (potentialPrimes[i] != null) {
                val prime = i + 2
                for (j in (i + prime)..potentialPrimes.lastIndex step prime) {
                    potentialPrimes[j] = null
                }
            }
        }
        return potentialPrimes.filterNotNull()
    }
}
