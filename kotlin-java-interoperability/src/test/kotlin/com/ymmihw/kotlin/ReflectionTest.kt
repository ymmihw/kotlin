package com.ymmihw.kotlin

import org.junit.Test
import kotlin.test.assertEquals

class ReflectionTest {
	@Test
	fun givenCustomer_whenGetConstructor_thenComplete() {
		val instance = Customer::class.java
		val constructors = instance.constructors

		assertEquals(constructors.size, 1)
		assertEquals(constructors[0].name, "com.ymmihw.kotlin.Customer")
	}
}