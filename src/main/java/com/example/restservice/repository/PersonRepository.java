package com.example.restservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.restservice.domain.Person;

@Repository(value = "people")
public interface PersonRepository extends MongoRepository<Person, String> {

	@Query(value = "{'active': true}")
	List<Person> findActivePersons();

	List<Person> findAll(int age);

}