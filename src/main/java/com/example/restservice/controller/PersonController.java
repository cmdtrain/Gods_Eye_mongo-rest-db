package com.example.restservice.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.domain.Person;
import com.example.restservice.exception.PersonValidationException;
import com.example.restservice.service.PersonService;
import com.example.restservice.service.ValidationService;

@RestController
@RequestMapping("/persons")

// calling person service
public class PersonController {
	@Autowired
	private PersonService personService;

	// calling validation service
	@Autowired
	private ValidationService validationService;

	// log
	private Logger log = LoggerFactory.getLogger(PersonController.class);


	@GetMapping("/all")
	public List<Person> all() {
		return personService.findAll();

	}

	@PostMapping("/save")
	public Person newPerson(@RequestBody Person newPerson) throws PersonValidationException {
		log.info("log message for person controller: {}", newPerson);
		validationService.validate(newPerson);
		return personService.save(newPerson);

	}

	@GetMapping("/{id}")
	public Optional<Person> getPerson(@PathVariable String id) {
		return personService.getPerson(id);
	}

	@PutMapping("/replace/{id}")
	public Person replacePerson(@RequestBody Person newPerson, @PathVariable String id) {
		return personService.replacePerson(newPerson, id);
	}

	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable String id) {
		personService.delete(id);
	}

	@GetMapping("/by_age") // http://localhost:8080/persons/by_age?age=2   --  use this url
	public List<Person> filterByAge(@RequestParam int age) {
		log.info("Filtering persons by age: {}", age); //added log age
		return personService.findOlderPersons(age);
	}
}