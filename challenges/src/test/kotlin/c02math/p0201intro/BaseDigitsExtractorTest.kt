package learn.ktkatas.challenges.c02math.p0201intro

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

abstract class BaseDigitsExtractorTest(
    private val extractor: IDigitsExtractor
) {
    @ParameterizedTest
    @MethodSource("argumentProvider")
    fun extract(number: Int, expectedDigits: List<Int>) {
        val actual = extractor.extract(number)
        assertEquals(expectedDigits, actual)
    }

    companion object {
        @JvmStatic
        fun argumentProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(2, listOf(2)),
            Arguments.of(123, listOf(3, 2, 1)),
        )
    }
}
