package com.ymmihw.kotlin

import java.time.LocalDateTime
import java.time.ZoneOffset

fun recursiveFactorial(n: Long): Long {
	return if (n <= 1) {
		n
	} else {
		n * recursiveFactorial(n - 1)
	}
}

tailrec fun factorial(n: Long, accum: Long = 1): Long {
	val soFar = n * accum
	return if (n <= 1) {
		soFar
	} else {
		factorial(n - 1, soFar)
	}
}

fun now(): Long {
	return LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli()
}

fun main(args: Array<String>) {

	val count = 1_000_000
	val input = 500L
	var a = now()
	for (i in 1..count) {
		recursiveFactorial(input)
	}
	println(now() - a)

	a = now()
	for (i in 1..count) {
		factorial(input)
	}
	println(now() - a)
}