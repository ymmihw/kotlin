package com.ymmihw.kotlin.mockito

class LendBookManager(val bookService: BookService) {
	fun checkout(bookId: Int, memberId: Int) {
		if (bookService.inStock(bookId)) {
			bookService.lend(bookId, memberId)
		} else {
			throw IllegalStateException("Book is not available")
		}
	}
}
