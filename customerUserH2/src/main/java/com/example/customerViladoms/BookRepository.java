package com.example.customerViladoms;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

	Optional<Book> findById(String id);

	void deleteById(String id);

	boolean existsById(String id);
	
	void deleteByAuthor(String author);

	long countByAuthor(String author);

}
