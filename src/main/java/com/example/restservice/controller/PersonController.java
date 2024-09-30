package com.example.restservice.controller;

import java.util.List;
import java.util.logging.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.domain.Person;
import com.example.restservice.service.PersonService;
import com.mongodb.internal.diagnostics.logging.Logger;

@RestController("/persons")
public class PersonController {
	@Autowired
	private PersonService personService;
	
	Logger logger = LogManager.getLogger(PersonController.class);
	logger.info("person controller log message");

	@GetMapping("/all")
	public List<Person> all() {
		return personService.findAll();
	}

	@PostMapping("/save")
	public Person newPerson(@RequestBody Person newPerson) {
		return personService.save(newPerson);
	}

	@GetMapping("/{id}")
	public Person getPerson(@PathVariable Long id) {
		return personService.getPerson(id);
	}

	@PutMapping("/replace/{id}")
	public Person replacePerson(@RequestBody Person newPerson, @PathVariable Long id) {
		return personService.replacePerson(newPerson, id);
	}

	@DeleteMapping("/{id}")
	void deletePerson(@PathVariable String id) {
		personService.delete(id);
	}

}