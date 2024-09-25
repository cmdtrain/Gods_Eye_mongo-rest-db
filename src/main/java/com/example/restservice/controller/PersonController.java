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
import com.example.restservice.service.counter;




@RestController
public class PersonController {
	
	private final PersonRepository repository;
	
	PersonController(PersonRepository repository) {
		this.repository = repository;
	}

	//root
	@GetMapping("/persons")
	  List<Person> all() {
	    return repository.findAll();
	  }
	
	@PostMapping("/persons")
	  Person newPerson(@RequestBody Person newPerson) {
	    return repository.save(newPerson);
	  }
		
	

	
	//single item
	@GetMapping("/persons/{id}")
	  Person one(@PathVariable Long id) {
	    
	    return repository.findById(id)
	      .orElseThrow(() -> new PersonNotFoundException(id));
	  }
	
	
	 @PutMapping("/persons/{id}")
	  Person replacePerson(@RequestBody Person newPerson, @PathVariable Long id) {
	    
	    return repository.findById(id)
	      .map(person -> {
	        person.setName(newPerson.getName());
	        person.setRole(newPerson.getRole());
	        return repository.save(person);
	      })
	      .orElseGet(() -> {
	        return repository.save(newPerson);
	      });
	  }

	
	
	 @DeleteMapping("/persons/{id}")
	  void deletePerson(@PathVariable String id) {
	    repository.deleteById(id);
	 }

}
	

//post, delete, patch