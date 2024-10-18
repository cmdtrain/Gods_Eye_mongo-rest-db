package com.example.restservice.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.domain.Person;
import com.example.restservice.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	// log
	private Logger log = LoggerFactory.getLogger(PersonService.class);

	public Optional<Person> getPerson(String id) {
		return personRepository.findById(id);
	}

	public List<Person> findAll() {
		return personRepository.findActivePersons();
	}

	public Person save(Person newPerson) {
		log.info("log message for person service");
		personRepository.save(newPerson);
		return newPerson;
	}

	public Person replacePerson(Person newPerson, String newId) {
		newPerson.setId(newId);
		personRepository.save(newPerson);
		return newPerson;
	}

	public void delete(String id) {
		log.info("Object deleted from database");
		personRepository.deleteById(id);

	}

	public List<Person> findOlderPersons(int age) {
		return personRepository.findAll();
	}

}