package learn.ktkatas.challenges.c02math.p0202exercises

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

abstract class BaseEx4PrimeNumbersTest(
    private val implementation: IEx4PrimeNumbers
) {
    @ParameterizedTest(name = "calcPrimesUpTo({0}) = {1}")
    @MethodSource("argumentProvider")
    fun test(limit: Int, expectedPrimes: List<Int>) {
        val actualPrimes = implementation.calcPrimesUpTo(limit)
        assertEquals(expectedPrimes, actualPrimes)
    }

    companion object {
        @JvmStatic
        fun argumentProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(5, listOf(2, 3, 5)),
            Arguments.of(15, listOf(2, 3, 5, 7, 11, 13)),
            Arguments.of(25, listOf(2, 3, 5, 7, 11, 13, 17, 19, 23)),
            Arguments.of(50, listOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47)),
        )
    }
}
