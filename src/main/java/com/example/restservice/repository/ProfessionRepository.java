package com.example.restservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.restservice.domain.Person;

@Repository(value = "profession")
public interface ProfessionRepository extends MongoRepository<Person, String> {
}