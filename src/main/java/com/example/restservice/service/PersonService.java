package com.example.restservice.service;

import java.util.List;

import org.slf4j.LoggerFactory;
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
	
	//log
	private static Logger log = (com.mongodb.internal.diagnostics.logging.Logger) LoggerFactory.getLogger(PersonService.class);
	
	public static void main(String[] args) {
	com.mongodb.internal.diagnostics.logging.Logger logger = null;
	logger.info("person service log message");}

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