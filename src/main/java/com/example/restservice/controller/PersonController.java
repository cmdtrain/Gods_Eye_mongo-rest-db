package com.example.restservice.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.domain.Person;
import com.example.restservice.repository.PersonRepository;
import com.example.restservice.service.PersonService;




@RestController
public class PersonController {
	
	
	private final PersonService personService;
	
	public PersonController (PersonService personService) {}
	PersonController(PersonService service, PersonService personService) {
		this.personService = personService;
	}

	//root
	@GetMapping("/persons")
	  List<Person> all() {
	    return personService.findAll();
	  }
	
	@PostMapping("/persons")
	  Person newPerson(@RequestBody Person newPerson) {
	    return personService.save(newPerson);
	  }
		
	

	
	//single item
	@GetMapping("/persons/{id}")
	  Person one(@PathVariable Long id) {
	    
	    PersonService service;
		return personService.findById(id)
	      .orElseThrow(() -> new PersonNotFoundException(id));
	  }
	
	
	 @PutMapping("/persons/{id}")
	  Person replacePerson(@RequestBody Person newPerson, @PathVariable Long id) {
	    
		 return personService.findById(id)
			      .map(person -> {
			        person.setName(newPerson.getName());
			        person.setRole(newPerson.getRole());
			        return repository.save(person);
			      })
	      .orElseGet(() -> {
	        return personService.save(newPerson);
	      });
	  }

	
	
	 @DeleteMapping("/persons/{id}")
	  void deletePerson(@PathVariable String id) {
	    personService.deleteById(id);
	 }

}
	

//post, delete, patch




