package com.example.restservice.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.domain.Person;
import com.example.restservice.service.PersonService;

@RestController
@RequestMapping("/persons")

public class PersonController {
	@Autowired
	private PersonService personService;

	// log
	private Logger log = LoggerFactory.getLogger(PersonController.class);

	@GetMapping("/all")
	public List<Person> all() {
		return personService.findAll();

	}

	@PostMapping("/save")
	public Person newPerson(@RequestBody Person newPerson) {
		log.info("log message for person controller: {}", newPerson);
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