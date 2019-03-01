package com.ymmihw.kotlin

import org.junit.Ignore
import org.junit.Test
import org.slf4j.LoggerFactory

class JavaReflectionTest {
	private val LOG = LoggerFactory.getLogger(JavaReflectionTest::class.java)

	@Test
	fun listJavaClassMethods() {
		Exception::class.java.methods
			.forEach { method -> LOG.info("Method: {}", method) }
	}

	@Test
	fun listKotlinClassMethods() {
		JavaReflectionTest::class.java.methods
			.forEach { method -> LOG.info("Method: {}", method) }
	}

	@Test
	fun listKotlinDataClassMethods() {
		data class ExampleDataClass(val name: String, var enabled: Boolean)

		ExampleDataClass::class.java.methods
			.forEach { method -> LOG.info("Method: {}", method) }
	}


}
