package learn.ktkatas.challenges.c02math.p0202exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

abstract class BaseEx2NumberAsTextTest(
    private val implementation: IEx2NumberAsText
) {
    @ParameterizedTest
    @MethodSource("argumentProvider")
    fun test(number: Int, expected: String) {
        val actual = implementation.numberAsText(number)
        assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun argumentProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(7, "SEVEN"),
            Arguments.of(42, "FOUR TWO"),
            Arguments.of(24680, "TWO FOUR SIX EIGHT ZERO"),
            Arguments.of(13579, "ONE THREE FIVE SEVEN NINE"),
        )
    }
}
