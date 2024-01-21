package learn.ktkatas.challenges.c02math.p0202exercises.solution

import learn.ktkatas.challenges.c02math.p0202exercises.IEx1bStatistics

class Ex1bStatistics : IEx1bStatistics {
    override fun calcCountAndSumAllNumbersDivBy2Or7(maximum: Int): Pair<Int, Int> {
        var count = 0
        var sum = 0
        for (n in 2..<maximum) {
            if (n % 2 == 0 || n % 7 == 0) {
                count++
                sum += n
            }
        }
        return count to sum
    }
}
