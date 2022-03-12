package com.example.MyFirstProject;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apilibrary")
public class LibraryRestController {
	
	@Autowired
	BookService bookservice;
	
	@Autowired
	MovieService movieservice;
	
	@GetMapping("books")
	public Iterable<Book>getAllBooks() {
		
		System.out.println("ejecutandoControllerGetAllNooks");
		return bookservice.queryBook();
		
	}
	
	@PostMapping(path = "/addBook", consumes = "application/json")
	public Book createBook(@RequestBody Book book) {
		
		
		System.out.println(LocalDate.now());
		
		Book bookSaved = bookservice.addBook(book);	
		
		System.out.println("This is the object that gets from client/posstman in java class book" + book);
		
		return bookSaved;
		
	}
	
	@DeleteMapping ("/delete/{title}") 
	public String deleteBook(@PathVariable String title){
		
		String responsedelete = "";		
		int indexBook = bookservice.findBookByTitle(title);
		
		if ( indexBook != -1) {
			bookservice.deleteBook(indexBook);
			
			System.out.println("Book found in " + indexBook + "and deleted");
			responsedelete = responsedelete + "book: " + title + "this book has been deleted";
			
			
		} else {
			
			responsedelete = responsedelete + "book: " + title + " this book has not been finded";
		}
		
		return responsedelete;			
			
			
		}
			  
	
	
	@GetMapping("movies")
	public Iterable<Movie> getAllMovies () {
		return movieservice.queryMovies();
	}
	
	/*
	 * @GetMapping("newspapers") public Iterable<Newspaper> getAllNewsPaper () {
	 * return null; }
	 */
	
	
	@PostMapping("/replaceBook/{title}")
	public String updateBook (@PathVariable String title, @RequestBody Book bookFromRest) {
		
		String responseUpdate = "";
		
		responseUpdate += "book found";
		Boolean update = false;
			
		int indexBook = bookservice.findBookByTitle(title);
		Book bookToUpdate = bookservice.getBookIndex(indexBook);
		
		if ( indexBook == -1) {

			responseUpdate = responseUpdate + "book not found";
			
		} else {
			
			
			
			
			if(bookFromRest.getAuthor() != null) {
				responseUpdate += " - autor name value updated: " + bookFromRest.getAuthor() + "( old value: " + bookToUpdate.getAuthor() + ")"; 
				bookToUpdate.setAutor( bookFromRest.getAuthor());
				update = true;
			}
			
			if(bookFromRest.getISN() != null) {
				responseUpdate += " - ISN value update: " + bookFromRest.getISN() + "( old value: " + bookToUpdate.getISN()+ ")";
				bookToUpdate.setISN( bookFromRest.getISN());
				update = true;
			}
				
			
			if(bookFromRest.getPages() != 0) {
				responseUpdate += " - pages value update: " + bookFromRest.getPages() + "( old value: " + bookToUpdate.getPages()+ ")";
				bookToUpdate.setPages( bookFromRest.getPages());
				update = true;
			}
			
			if(bookFromRest.getYear() != 0)
				responseUpdate += " - year value update: " + bookFromRest.getYear() + "( old value: " + bookToUpdate.getYear()+ ")";
				bookToUpdate.setPages( bookFromRest.getYear());
				update = true;
			}
				
		
			if(!update) responseUpdate += " - try to uypdate but any field updated - something wrong happened";
			
			
			
			bookservice.replaceBook(indexBook, bookToUpdate);
					
			return responseUpdate;
		
		
	}	  
	 
	
}
	
	
	
