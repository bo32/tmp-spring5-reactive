package com.david.spring.test.spring5.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.spring.test.spring5.dao.BookRepository;
import com.david.spring.test.spring5.entities.Book;

import reactor.core.publisher.Flux;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public Flux<Book> getAllReactiveBooks(int quantity) {
		return bookRepository.getAllReactiveBooks(quantity);		
	}
	
	public List<Book> getAllBooks(int quantity) {
		return bookRepository.getAllBooks(quantity);
	}

}
