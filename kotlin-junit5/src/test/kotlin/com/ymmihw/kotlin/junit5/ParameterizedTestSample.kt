package com.ymmihw.kotlin.junit5

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource

class ParameterizedTestSample {
	@ParameterizedTest
	@MethodSource("squares")
	fun testSquares1(input: Int, expected: Int) {
		Assertions.assertEquals(expected, input * input)
	}

	companion object {
		@JvmStatic
		fun squares() = listOf(
			Arguments.of(1, 1),
			Arguments.of(2, 4)
		)
	}

	@ParameterizedTest
	@CsvSource(
		"1, 1",
		"2, 4",
		"3, 9"
	)
	fun testSquares2(input: Int, expected: Int) {
		Assertions.assertEquals(expected, input * input)
	}
}