package com.example.EmployeeDB;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableMongoRepositories
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    
    
    @Query("{name:'?0'}")
    Employee findItemByName(String name);
    
    @Query(value="{category:'?0'}", fields="{'name' : 1, 'age' : 1}")
    List<Employee> findAll(String surname);

	List<Employee> findItemByAge(int age);

	List<Employee> findItemBySurname(String surname);
    
}