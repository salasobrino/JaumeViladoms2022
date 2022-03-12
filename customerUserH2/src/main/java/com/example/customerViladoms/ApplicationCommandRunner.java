package com.example.customerViladoms;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class ApplicationCommandRunner implements CommandLineRunner {
	

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	UserService userService;
	@Autowired
	BookService bookService;

	@Override
	public void run(String... args) throws Exception {

		logger.info("Welcome to the runner from commandLineRunner");

		
		User user1 = new User("U001","Tom", "Jones", 1985);
		User user2 = new User("U002", "Silvia", "Eriksson", 1923);
		User user3 = new User("U003", "Anna", "Gates", 1956);
		User user4 = new User("U004", "Paul", "Gates", 2001);
		
		userService.save(user1);
		userService.save(user2);
		userService.save(user3);
		userService.save(user4);
		
		Book book1 = new Book ("B001" ,"Anna Karenina", "Tolstoi", 562, 1896, "BR5GV-5-ERG5-6567");
		Book book2 = new Book ("B002", "To the lighthouse", "V Wolf", 235, 1626, "56756-DFGRT-554" );
		Book book3 = new Book ("B003", "I LOVE JAVA", "Anna", 2, 2023, "GWR-456" );
		Book book4 = new Book ("B004", "1984", "George Orwell", 450, 1949, "DDR-656361");
		
		
		bookService.save(book1);
		bookService.save(book2);
		bookService.save(book3);
		bookService.save(book4);
		
		userService.save(new User("U005", "Paul", "Mendez", 2006));
		
		
		//we add to arraylist books of user
		
		user1.addBook(book1);
		user1.addBook(book2);
		user1.addBook(book3);
		user2.addBook(book3);
//		user3.addBook(book4);
//		user4.addBook(book1);
		
		//save to bd by JPA query crudrepository-service
		userService.save(user1);
		userService.save(user2);
		
		logger.info("toString user1" + user1);
		logger.info("toString user2" + user2);
		
		logger.info("user1 get books" + user1.getBooks());
		logger.info("user2 get books" + user2.getBooks());
		
		
		
		
		
	//--------------------------------------------------------------------	
		
		//logger.info("count: " + bookService.count());
		/*
		 * logger.info(bookService.findAll());
		 * 
		 * 
		 * logger.info("count: " + userService.count());
		 * logger.info(userService.findAll()); logger.info("exists ['1']: " +
		 * userService.existsById("1"));
		 * 
		 * 
		 * userService.findAndDeleteById("1");
		 * 
		 * logger.info("count: " + userService.count());
		 * logger.info(userService.findAll()); logger.info("exists ['1']: " +
		 * userService.existsById("1"));
		 * 
		 * userService.save(new User("5", "Paul", "Mendez"));
		 * 
		 * 
		 * logger.info("count: " + userService.count());
		 * logger.info(userService.findAll()); logger.info("exists ['1']: " +
		 * userService.existsById("1")); logger.info("exists ['5']: " +
		 * userService.existsById("5"));
		 * 
		 * user2.setFirstName("Olga"); logger.info("count: " + userService.count());
		 * userService.update("2", user2); logger.info(userService.findAll());
		 * 
		 * logger.info("count by lastname: " + userService.countByLastname("Gates"));
		 * 
		 * book1.setUser(user2); book2.setUser(user2); book3.setUser(user2);
		 * 
		 * bookService.save(book1); bookService.save(book2); bookService.save(book3);
		 * 
		 * logger.info("toString book1: " + book1); logger.info("toString book1: " +
		 * book1.getTitle()); logger.info("toString user2: " + user2);
		 * 
		 * Book book4 = new Book ("B004", "I LOVE Js", "Anna", 2, 2023, "GWR-456" );
		 * book4.setUser(user3); bookService.save(book4);
		 */
		
	//--------------------------------------------------------------------------------
		
		
	}

}
