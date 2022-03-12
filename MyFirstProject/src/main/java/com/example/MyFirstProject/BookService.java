package com.example.MyFirstProject;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	static List<Book> books = new ArrayList<Book>();
	
	static {
		
		//String title, String author, int pages, int year, String iSN
		
		Book book1 = new Book ("Anna Karenina", "Tolstoi", 562, 1896, "BRNE-GHSI-678");
		Book book2 = new Book ("To the ligth house", "Virgina Wolf", 235, 1996, "BRNE-GHSI-679");		
		//Book book3 = new Book ();
		//Book book4 = new Book ();
		//Book book5 = new Book ();
		//Book book6 = new Book ();	
		
		books.add(book1);
		books.add(book2);
		
	}
	
	public List<Book> queryBook(){
		
		return books;
		
	}
	
	public Book addBook(Book book) {
		
		books.add(book);
		
		return book;
		
		
			
	}
	
	
	  public String deleteBook (String title) {
		  
		  
	  int index = findBookByTitle(title);
	  books.remove(index);
	  
	  return "Book has been Deleted by title";
	  
	  }
	  
	  public String deleteBook (int index) {
		  
		  books.remove(index);
		  
		  return "Book has been Deleted by index";
		  
	  }

	public int findBookByTitle(String title) {
		// TODO Auto-generated method stub
		
		int index = -1;
		for ( Book bookIndexFind: this.books) {
			
			if(bookIndexFind.getTitle().equals(title)) {
				
				index = this.books.indexOf(bookIndexFind);
				
				} 
								
			}
		
			return index;
			
		}

	public Book replaceBook(int indexBook, Book book) {
		// TODO Auto-generated method stub
		
		books.set(indexBook, book);
		
		return book;
		
	}
	
	public Book getBookIndex (int index) {
		Book book = books.get(index);
		
		return book;
	}
	
	
		
	}
	 


