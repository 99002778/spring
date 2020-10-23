package com.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;

@RestController
@RequestMapping("/books-api")

public class BookController {
	@Autowired
	BookService bookservice;
	@PostMapping("/books")
	Book addBook(@RequestBody Book book) {
		return bookservice.addBook(book);
	}
	@DeleteMapping("/books/delete-one/{bookId}")
	boolean deleteBook(@PathVariable("bookId")int bookid) throws BookNotFoundException {
		return bookservice.deleteBook(bookid);
		
	}
	@GetMapping("/books/get-one/{bookId}")
	Book getBookById(@PathVariable("bookId") int bookid) throws BookNotFoundException {
		return bookservice.getBookById(bookid);
		
	}
	@PutMapping("/books/update-one")
	Book  updateBook(Book book) {
		return bookservice.updateBook(book);
		
	}
	@GetMapping("/books")
	List<Book>getAllBooks(){
		return bookservice.getAllBooks();
		
	}
	 
	@GetMapping("/books/category/{category}")
	List<Book> getBookbycategory(@PathVariable("category") String category)throws BookNotFoundException{
		return bookservice.getBookbycategory(category);
		}
	@GetMapping("/books/author/{author}")
	List<Book> getBookbyAuthor(@PathVariable("author")String author)throws BookNotFoundException{
		return bookservice.getBookbycategory(author);
		}
	@GetMapping("/books/titleauthor/{title}/{author}")
	public List<Book> findByTitleAndAuthor(@PathVariable("title")String title,@PathVariable("author")String author){
		return bookservice.findByTitleAndAuthor(title,author);
	}
	@GetMapping("/books/titleprice/{title}/{price}")
	public List<Book> findByTitleAndPrice(@PathVariable("title")String title,@PathVariable("price")Double price){
		return bookservice.findBooksByTitleAndPrice(title,price);
	}
	
	
}
