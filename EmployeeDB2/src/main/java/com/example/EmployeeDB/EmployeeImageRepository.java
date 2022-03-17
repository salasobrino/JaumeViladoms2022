package com.example.EmployeeDB;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

/*@Component
@EnableMongoRepositories*/
public interface EmployeeImageRepository extends MongoRepository <EmployeeImage, String> {

}
