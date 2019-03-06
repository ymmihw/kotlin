package com.ymmihw.kotlin

class SimpleThread : Thread() {

	override fun run() {
		println("${Thread.currentThread()} has run.")
	}
}