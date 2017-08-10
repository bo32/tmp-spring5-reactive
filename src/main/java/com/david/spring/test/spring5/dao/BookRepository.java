package com.david.spring.test.spring5.dao;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.david.spring.test.spring5.entities.Book;

import reactor.core.publisher.Flux;

@Repository
public class BookRepository {
	
	public Flux<Book> getAllReactiveBooks(int qty) {
		
//		return withDelay(Flux.fromIterable(books));
		return Flux.fromIterable(getAllBooks(qty));
	}
	
//	private Flux<Book> withDelay(Flux<Book> userFlux) {
//		return Flux
//				.interval(Duration.ofMillis(1000))
//				.zipWith(userFlux, (i, user) -> user);
//	}
	
	public List<Book> getAllBooks(int qty) {
		List<Book> books = new ArrayList<Book>();

		for (int i = 0; i < qty; i++) {
			Book book = new Book();
			book.setId(new Long(i));
			book.setTitle("Title " + i);
			book.setAuthor("Author " + i);
			books.add(book);	
		} 
		return books;
	}

}
