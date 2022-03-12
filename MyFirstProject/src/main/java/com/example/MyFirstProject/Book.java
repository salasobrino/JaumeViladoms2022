package com.example.MyFirstProject;



public class Book {
	
	private String title;
	private String author;
	private int pages;
	private int year;
	private String ISN;
	
	public Book () {
		super();
	}

	

	public Book(String title, String author, int pages, int year, String iSN ) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.year = year;
		ISN = iSN;
		
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

	public void setAutor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getISN() {
		return ISN;
	}

	public void setISN(String iSN) {
		ISN = iSN;
	}


	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", year=" + year + ", ISN=" + ISN
				+ "]";
	}

}
