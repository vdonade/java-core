package com.learning.core.day3session2;

import java.time.LocalDate;
import java.util.TreeSet;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private LocalDate dateOfPublication;
    private String author;

    public Book(int bookId, String title, double price, LocalDate dateOfPublication, String author) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.dateOfPublication = dateOfPublication;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDateOfPublication() {
        return dateOfPublication;
    }

    public String getAuthor() {
        return author;
        
    }

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0; 
	}
	
	

