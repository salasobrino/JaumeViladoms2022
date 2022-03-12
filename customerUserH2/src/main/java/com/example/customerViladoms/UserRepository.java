package com.example.customerViladoms;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String>{

	long countByLastName(String lastname);

	void deleteByLastName(String lastname);

}
