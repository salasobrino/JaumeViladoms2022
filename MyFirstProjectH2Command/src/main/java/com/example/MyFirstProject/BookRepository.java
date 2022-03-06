package com.example.MyFirstProject;



import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository <Book1, Table> {
	

}
