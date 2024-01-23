package learn.ktkatas.challenges.c02math.p0202exercises.solution

import learn.ktkatas.challenges.c02math.p0202exercises.IEx2NumberAsText
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow

class Ex2NumberAsText : IEx2NumberAsText {
    private val digitWords = arrayOf(
        "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN"
    )

    override fun numberAsText(number: Int): String {
        val powerFor10 = floor(log10(number.toDouble())).toInt()
        var current = number
        return buildString {
            for (n in powerFor10 downTo 0) {
                val pow10 = 10.0.pow(n).toInt()
                val digit = current / pow10
                if (isNotEmpty()) append(' ')
                append(digitWords[digit])
                current %= pow10
            }
        }
    }
}
