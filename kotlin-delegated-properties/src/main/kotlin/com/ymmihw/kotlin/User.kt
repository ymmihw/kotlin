package com.ymmihw.kotlin

class User(val id: Int) {
	var name: String by DatabaseDelegate("name", id)
	var age: Int by DatabaseDelegate("age", id)
}
