package learn.ktkatas.challenges.c02math.p0201intro

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

abstract class BasePrimeCheckerSimpleTest(private val checker: IPrimeChecker) {
    @ParameterizedTest
    @MethodSource("argumentProvider")
    fun isPrime(number: Int, expected: Boolean) {
        val actual = checker.isPrime(number)
        assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun argumentProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(2, true),
            Arguments.of(3, true),
            Arguments.of(4, false),
            Arguments.of(5, true),
            Arguments.of(6, false),
            Arguments.of(7, true),
            Arguments.of(8, false),
            Arguments.of(9, false),
        )
    }
}
