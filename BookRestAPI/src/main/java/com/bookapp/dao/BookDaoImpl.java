package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.model.Book;
@Service
public class BookDaoImpl implements BookDAO {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Book> newbooklist=new ArrayList<>();
		for(Book book:showBookList()) {
			if(book.getAuthor().equals(author))
				newbooklist.add(book);
		}
		
		return newbooklist;
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> newbooklist=new ArrayList<>();
		for(Book book:showBookList()) {
			if(book.getCategory().equals(category))
				newbooklist.add(book);
		}
		
		return newbooklist;
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		
		for(Book book:showBookList()) {
			if(book.getBookId()==id) {
				return book;
			}
				
		}
		return null;
		
	}
	private List<Book> showBookList(){
		return Arrays.asList(
				new Book(11,"Learn java","kathy","tech",900.00),
				new Book(12,"7habits","steve","selfhepl",1000.0),
				new Book(13,"Ikagai","tom","Selfhelp",1000.0)
			);
	}

}
