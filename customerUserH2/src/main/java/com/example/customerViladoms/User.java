package com.example.customerViladoms;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	public String id;
	public String firstName;
	public String lastName;
	public int year;
	
	//@OneToMany to create a bidireccional mapping from user to book
	//we need mappedBy to access to user form books
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Book> books = new ArrayList<Book>();
	
	
	public User() {
		
	}
	
	public User(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(String id, String firstName, String lastName, int year) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
	}
	
	public List<Book> getBooks(){
		return books;
	}
	
	//very important method cause it allows
	//to access books from user
	public void addBook(Book book) {
		this.books.add(book);
			//we need to add this line cause one book CAN'T be in two users' array books at same time
			//so when user is set in book object, we MUST check if this field user in book is empty or not
			//if it is empty we go along if not we MUST remove this book from previous user array books.
		if(book.getUser() != null) book.getUser().getBooks().remove(book);
		//book.setUser(this);
		
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", year=" + year + ", books="
				+ books + "]";
	}
	
	

	
}
