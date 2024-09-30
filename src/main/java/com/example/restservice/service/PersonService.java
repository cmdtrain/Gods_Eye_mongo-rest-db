package com.example.restservice.service;

import java.util.List;
import java.util.logging.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.controller.PersonController;
import com.example.restservice.domain.Person;
import com.example.restservice.repository.PersonRepository;
import com.mongodb.internal.diagnostics.logging.Logger;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	Logger logger = LogManager.getLogger(PersonService.class);
	logger.info("person service log message");

	public Person getPerson(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Person save(Person newPerson) {
		// TODO Auto-generated method stub
		return newPerson;
	}

	public Person replacePerson(Person newPerson, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}