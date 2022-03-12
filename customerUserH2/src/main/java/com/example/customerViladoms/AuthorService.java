package com.example.customerViladoms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
	
	@Autowired
	AuthorRepository authorRepo;
	
	public List<Author> authors = new ArrayList<Author>();
	
	

}
