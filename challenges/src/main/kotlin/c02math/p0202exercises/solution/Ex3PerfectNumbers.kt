package learn.ktkatas.challenges.c02math.p0202exercises.solution

import learn.ktkatas.challenges.c02math.p0202exercises.IEx3PerfectNumbers

class Ex3PerfectNumbers : IEx3PerfectNumbers {
    override fun calcPerfectNumbers(maximum: Int): List<Int> =
        (6..<maximum).filter {
            it.isPerfect()
        }.toList()

    private fun Int.isPerfect(): Boolean {
        var sum = 1
        for (d in 2..(this / 2)) {
            if (this % d == 0) {
                sum += d
            }
        }
        return sum == this
    }
}
