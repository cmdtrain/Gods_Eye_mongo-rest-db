package com.example.restservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.restservice.domain.Person;

@Repository(value = "people")
public interface PersonRepository extends MongoRepository<Person, String> {

	List<Person> findByLastName(@Param("name") String name);

	Person findByFirstName(String firstName);

	Person findById(Long id);

}