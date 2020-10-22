package com.bookapp.model;

public class Book {
	Integer BookId;
	String title;
	String author;
	String category;
	Double Price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bookId, String title, String author, String category, Double price) {
		super();
		BookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		Price = price;
	}
	public Integer getBookId() {
		return BookId;
	}
	public void setBookId(Integer bookId) {
		BookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", Price=" + Price + "]";
	}
	

}
