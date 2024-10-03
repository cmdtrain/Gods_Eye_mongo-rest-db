package com.example.restservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.controller.PersonController;
import com.example.restservice.domain.Person;
import com.example.restservice.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	// log
	private Logger log = LoggerFactory.getLogger(PersonService.class);

	public Person getPerson(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Person save(Person newPerson) {
		log.info("log message for person service");
		Object save = personRepository.save;
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