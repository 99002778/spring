package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookservice;
	@GetMapping("/books")
	public List<Book>showAllBooks(){
		return bookservice.getAllBooks();
		
	}
	@GetMapping("/book-by-author/{author}")
	public List<Book> getByAuthor(@PathVariable("author")String author){
		return bookservice.getByAuthor(author);
	}
	@GetMapping("/book-by-category/{category}")
	public List<Book> getByCategory(@PathVariable("category")String category){
		return bookservice.getByCategory(category);
	}
	@GetMapping("/book-by-id/{id}")
	public Book getById(@PathVariable("id")int id){
		return bookservice.getById(id);
	}
	
}
