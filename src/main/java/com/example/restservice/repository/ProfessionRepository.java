package com.example.restservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.restservice.domain.Person;

public class ProfessionRepository {

	@Repository(value = "profession")
	public interface PersonRepository extends MongoRepository<Person, String> {}
}
