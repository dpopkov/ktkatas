package learn.ktkatas.challenges.c02math.p0201intro

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

abstract class BaseDividerFinderTest(val finder: IDividerFinder) {
    @ParameterizedTest
    @MethodSource("argumentProvider")
    fun findDividersOf(number: Int, expected: List<Int>) {
        val actual = finder.findDividersOf(number)
        assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun argumentProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(6, listOf(1, 2, 3)),
            Arguments.of(24, listOf(1, 2, 3, 4, 6, 8, 12)),
            Arguments.of(7, listOf(1)),
        )
    }
}
