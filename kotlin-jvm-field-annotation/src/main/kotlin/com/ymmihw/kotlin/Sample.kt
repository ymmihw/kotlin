package com.ymmihw.kotlin

class Sample {
	var quantity = 0
		set(value) {
			if (value >= 0) field = value
		}
}

class KotlinJvmSample {
	@JvmField
	val example = "Hello!"
}

class StaticSample {
	companion object {
		@JvmField
		val MAX_LIMIT = 20
	}
}