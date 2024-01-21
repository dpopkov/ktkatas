package learn.ktkatas.challenges.c02math.p0202exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

abstract class BaseEx1bStatisticsTest(
    private val statistics: IEx1bStatistics
) {
    @ParameterizedTest
    @MethodSource("argumentProvider")
    fun testCalcCount(inputMaximum: Int, expected: Pair<Int, Int>) {
        val actual = statistics.calcCountAndSumAllNumbersDivBy2Or7(inputMaximum)
        assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun argumentProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(3, 1 to 2),
            Arguments.of(8, 4 to 19),
            Arguments.of(15, 8 to 63),
        )
    }
}
