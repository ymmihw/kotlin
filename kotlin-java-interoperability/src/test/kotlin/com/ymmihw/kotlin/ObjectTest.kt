package com.ymmihw.kotlin

import org.junit.Test
import kotlin.test.assertEquals

class ObjectTest {
	@Test
	fun givenCustomer_whenGetSuperType_thenComplete() {
		val instance = Customer::class
		val supertypes = instance.supertypes

		assertEquals(supertypes[0].toString(), "kotlin.Any")
	}
}