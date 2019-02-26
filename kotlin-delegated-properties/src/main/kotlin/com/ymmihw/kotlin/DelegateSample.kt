package com.ymmihw.kotlin

import kotlin.properties.Delegates

class DelegateExample(map: MutableMap<String, Any?>) {
	var name: String by map
}

class DatabaseBackedUser(userId: String) {
	val name: String by lazy {
		queryForValue("SELECT name FROM users WHERE userId = :userId", mapOf("userId" to userId))
	}
}

fun queryForValue(s: String, map: Map<String, String>): String {
	return s;
}


class ObservedProperty {
	var name: String by Delegates.observable("<not set>") { prop, old, new ->
		println("Old value: $old, New value: $new")
	}
}

fun main(args: Array<String>) {
	var a = ObservedProperty();
	a.name = "ymmihw"
	a.name = "whimmy"

	var b = DatabaseBackedUser("ymmihw");
	println(b.name)

	var c = DelegateExample(mutableMapOf("1" to "one", "name" to "ymmihw", "3" to "three"));
	println(c.name)
}