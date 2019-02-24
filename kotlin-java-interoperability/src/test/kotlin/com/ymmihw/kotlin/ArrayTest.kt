package com.ymmihw.kotlin

import org.junit.Test
import kotlin.test.assertEquals

class ArrayTest {

	@Test
	fun givenArray_whenValidateArrayType_thenComplete() {
		val ex = ArrayExample()
		val numArray = intArrayOf(1, 2, 3)

		assertEquals(ex.sumValues(numArray), 6)
	}

}