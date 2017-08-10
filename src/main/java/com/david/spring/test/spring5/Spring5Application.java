package com.david.spring.test.spring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.david.spring.test.spring5.entities.Book;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class Spring5Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring5Application.class, args);

	}
}
