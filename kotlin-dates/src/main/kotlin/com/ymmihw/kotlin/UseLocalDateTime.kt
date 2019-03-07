package com.ymmihw.kotlin

import java.time.LocalDateTime

class UseLocalDateTime {

	fun getLocalDateTimeUsingParseMethod(representation: String): LocalDateTime {
		return LocalDateTime.parse(representation)
	}
}