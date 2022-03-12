package com.example.customerViladoms;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//Exercici Jaume Viladoms Febrer 2022

@Entity
@Table(name = "author")
public class Author {
	
	@Id
	private String id;
	private String name;
	private String country;
	
//@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//@JoinTable(name = "AUTHOR_BOOK", joinColumns = { @JoinColumn(name = "FK_AUTHOR") }, inverseJoinColumns = { @JoinColumn(name = "FK_BOOK") })

	
//private List<Book> books = new ArrayList<Book>();


public Author() { }

public Author(String id, String name, String country) {
	super();
	this.id = id;
	this.name = name;
	this.country = country;
}

/*
 * public List <Book> getBooks(){ return books; }
 * 
 * public void AddBook(Book book) { this.books.add(book);
 * //book.addAuthor(this); }
 */

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}






}
