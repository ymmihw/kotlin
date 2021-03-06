package com.ymmihw.kotlin

import com.ymmihw.java.StringUtils
import org.junit.Test
import kotlin.test.assertEquals


class KotlinJavaInteroperabilityTest {

	@Test
	fun givenLowercaseString_whenExecuteMethodFromJavaStringUtils_shouldReturnStringUppercase() {
		//given
		val name = "tom"

		//whene
		val res = StringUtils.toUpperCase(name)

		//then
		assertEquals(res, "TOM")
	}
}
