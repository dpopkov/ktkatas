package learn.ktkatas.challenges.c02math.p0201intro.solution

import learn.ktkatas.challenges.c02math.p0201intro.IPrimeChecker

class PrimeCheckerSimple : IPrimeChecker {
    override fun isPrime(number: Int): Boolean {
        if (number != 2 && number % 2 == 0) return false
        for (divider in 3..(number / 2) step 2) {
            if (number % divider == 0) return false
        }
        return true
    }
}

