package com.david.spring.test.spring5.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.david.spring.test.spring5.entities.Book;
import com.david.spring.test.spring5.services.BookService;

import reactor.core.publisher.Flux;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping(value="/books/reactive/{quantity}", produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Book> getAllReactiveBooks(@PathVariable("quantity") int quantity) {
		return this.bookService.getAllReactiveBooks(quantity);
	}
	
	@GetMapping(value="/books/{quantity}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Book> getAllBooks(@PathVariable("quantity") int quantity) {
		return this.bookService.getAllBooks(quantity);
	}

}
