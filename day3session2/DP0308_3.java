package com.learning.core.day3session2;


	import java.util.Date;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Objects;
	import java.util.TreeSet;

	class Book implements Comparable<Book> {
	    private int bookId;
	    private String title;
	    private double price;
	    private Date publicationDate;
	    private String author;

	    public Book(int bookId, String title, double price, String author, String publicationDate) throws ParseException {
	        this.bookId = bookId;
	        this.title = title;
	        this.price = price;
	        this.author = author;
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        this.publicationDate = dateFormat.parse(publicationDate);
	    }

	    @Override
	    public String toString() {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        return bookId + " " + title + "\n" + price + " " + author + "\n" + dateFormat.format(publicationDate);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(bookId, title, price, publicationDate, author);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Book book = (Book) obj;
	        return bookId == book.bookId &&
	                Double.compare(book.price, price) == 0 &&
	                Objects.equals(title, book.title) &&
	                Objects.equals(publicationDate, book.publicationDate) &&
	                Objects.equals(author, book.author);
	    }

	    @Override
	    public int compareTo(Book other) {
	        return this.bookId - other.bookId;
	    }
	}

	public class DP0308_3 {
	    public static void main(String[] args) throws ParseException {
	        TreeSet<Book> bookSet = new TreeSet<>();
	        bookSet.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", "02/02/2020"));
	        bookSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", "19/05/1997"));
	        bookSet.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", "23/11/1984"));
	        bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", "19/11/1984"));
	        bookSet.add(new Book(1005, ".Net Platform", 0, "", "06/03/1984"));

	        for (Book book : bookSet) {
	            System.out.println(book);
	            System.out.println();
	        }
	    }
	}


