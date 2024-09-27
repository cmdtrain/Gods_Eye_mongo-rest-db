package com.example.restservice.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.restservice.domain.Person;
import com.example.restservice.repository.PersonRepository;

public class PersonService {

	  @Autowired
	  private PersonService PersonRepository;

	  public static void main(String[] args) {
	    SpringApplication.run(PersonRepository.class, args);
	  }

	

	private void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	private Person[] findByLastName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private char[] findByFirstName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Person save(Person person) {
		return person;
		// TODO Auto-generated method stub
		
	}



	public Optional<Person> findById(Long id, Collection<Person> persons) {
        return persons.stream()
            .filter(person -> person.getId().equals(id)) // Assume Person has getId()
            .findFirst();
    }


	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}



	public Optional<Person> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}