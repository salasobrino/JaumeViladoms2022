package com.example.MyFirstProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	static List<Movie>movies = new ArrayList<Movie>();
	
	
	static {
		
		Movie movie1 = new Movie ("Pelicula1", 1900);
		Movie movie2 = new Movie ("Pelicula2", 2000);
		Movie movie3 = new Movie ("Pelicula3", 2020);
		
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
	}
	
	public List<Movie>queryMovies(){
		
		System.out.println("Books" +  movies);
		
		return movies;
		
	}	
	

}
