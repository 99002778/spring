package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookRepository;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookrepository;

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		Book newbook=bookrepository.save(book);
		
		return newbook;
	}

	@Override
	public boolean deleteBook(Integer bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		bookrepository.deleteById(bookid);
		return true;
	}

	@Override
	public Book getBookById(Integer bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return bookrepository.findById(bookid)
		.orElseThrow(()->new BookNotFoundException("id not available"));
		
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		
		return bookrepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookrepository.findAll();
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return bookrepository.findByAuthor(author);
	}

	@Override
	public List<Book> getBookbycategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return bookrepository.findByCategoryOrderByTitleAsc(category);
	}

	@Override
	public List<Book> findByTitleAndAuthor(String title, String author) {
		// TODO Auto-generated method stub
		return bookrepository.findByTitleAndAuthor(title, author);
	}

	@Override
	public List<Book> findByTitleAndPrice(String title, Double price) {
		// TODO Auto-generated method stub
		return bookrepository.findBooksByTitleAndPrice(title, price);
	}

	@Override
	public List<Book> findBooksByTitleAndPrice(String title, Double price) {
		// TODO Auto-generated method stub
		return null;
	}

}
