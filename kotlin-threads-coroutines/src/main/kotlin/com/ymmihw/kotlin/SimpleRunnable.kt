package com.ymmihw.kotlin

class SimpleRunnable : Runnable {

	override fun run() {
		println("${Thread.currentThread()} has run.")
	}
}