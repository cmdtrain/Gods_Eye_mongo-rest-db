package com.example.restservice;
//
import java.util.List;
//
//
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.restservice.Person;
//
@Repository(value = "people")
public interface PersonRepository extends MongoRepository<Person, String> {
//
	List<Person> findByLastName(@Param("name") String name);
	Person findByFirstName(String firstName);

}