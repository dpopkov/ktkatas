package learn.ktkatas.challenges.c02math.p0202exercises

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

abstract class BaseEx5PrimeNumbersPairsTest(
    val implementation: IEx5PrimeNumbersPairs
) {
    @ParameterizedTest(name = "computeAllPairsOfPrimes({0}, {1})={2}")
    @MethodSource("argumentProvider")
    fun test(limit: Int, distance: Int, expectedPairs: List<Pair<Int, Int>>) {
        val actual = implementation.computeAllPairsOfPrimes(limit, distance)
        assertEquals(expectedPairs, actual)
    }

    companion object {
        @JvmStatic
        fun argumentProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(50, 2, listOf(3 to 5, 5 to 7, 11 to 13, 17 to 19, 29 to 31, 41 to 43)),
            Arguments.of(50, 4, listOf(3 to 7, 7 to 11, 13 to 17, 19 to 23, 37 to 41, 43 to 47)),
            Arguments.of(
                50,
                6,
                listOf(5 to 11, 7 to 13, 11 to 17, 13 to 19, 17 to 23, 23 to 29, 31 to 37, 37 to 43, 41 to 47, 47 to 53)
            ),
        )
    }
}
