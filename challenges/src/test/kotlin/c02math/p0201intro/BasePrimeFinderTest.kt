package learn.ktkatas.challenges.c02math.p0201intro

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

abstract class BasePrimeFinderTest(private val finder: IPrimeFinder) {
    @ParameterizedTest
    @MethodSource("argumentProvider")
    fun test(limit: Int, expected: List<Int>) {
        val actual = finder.findPrimesUpTo(limit)
        assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun argumentProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(2, listOf(2)),
            Arguments.of(3, listOf(2, 3)),
            Arguments.of(4, listOf(2, 3)),
            Arguments.of(5, listOf(2, 3, 5)),
            Arguments.of(6, listOf(2, 3, 5)),
            Arguments.of(7, listOf(2, 3, 5, 7)),
            Arguments.of(8, listOf(2, 3, 5, 7)),
            Arguments.of(15, listOf(2, 3, 5, 7, 11, 13)),
            Arguments.of(25, listOf(2, 3, 5, 7, 11, 13, 17, 19, 23)),
            Arguments.of(50, listOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47)),
        )
    }
}
