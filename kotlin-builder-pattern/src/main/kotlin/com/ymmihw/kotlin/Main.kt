package com.ymmihw.kotlin

fun main(args: Array<String>) {
	FoodOrder.Builder()
		.bread("bread")
		.condiments("condiments")
		.meat("meat")
		.fish("bread").let { println(it) }
}