package com.example.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.domain.Person;
import com.example.restservice.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	

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
		return null;
	}



	public Person replacePerson(Person newPerson, Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
}