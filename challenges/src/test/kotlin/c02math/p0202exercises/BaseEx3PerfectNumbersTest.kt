package learn.ktkatas.challenges.c02math.p0202exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

abstract class BaseEx3PerfectNumbersTest(
    private val implementation: IEx3PerfectNumbers
) {
    @ParameterizedTest(name = "calcPerfectNumbers({0}) = {1}")
    @MethodSource("argumentProvider")
    fun test(number: Int, expected: List<Int>) {
        val actual: List<Int> = implementation.calcPerfectNumbers(number)
        assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun argumentProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(100, listOf(6, 28)),
            Arguments.of(1000, listOf(6, 28, 496)),
            Arguments.of(10000, listOf(6, 28, 496, 8128)),
        )
    }
}
