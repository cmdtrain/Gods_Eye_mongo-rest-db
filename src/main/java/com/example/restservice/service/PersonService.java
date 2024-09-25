package com.example.restservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.restservice.domain.Greeting;
import com.example.restservice.domain.Person;
import com.example.restservice.repository.PersonRepository;

public class PersonService {

	  @Autowired
	  private PersonService PersonRepository;

	  public static void main(String[] args) {
	    SpringApplication.run(PersonRepository.class, args);
	  }

	  @GetMapping("/smthing smart1")
		public Greeting get(@RequestParam(value = "name", defaultValue = "World") String name) {
			System.out.println("get method: " + name);
			
			return new Greeting(counter.incrementAndGet(), String.format(name, name));}
		
		@PostMapping("/smthing smart2")
		public Greeting create(@RequestParam(value = "name", defaultValue = "World") String name) {
			System.out.println("create method: " + name);
			
			return new Greeting(counter.incrementAndGet(), String.format(name, name));}
		
		@PatchMapping("/smthing smart3")
		public Greeting update(@RequestParam(value = "name", defaultValue = "World") String name) {
			System.out.println("update method: " + name);
			
			return new Greeting(counter.incrementAndGet(), String.format(name, name));}
		
		@DeleteMapping("/smthing smart4")
		public Greeting delete(@RequestParam(value = "name", defaultValue = "World") String name) {
			System.out.println("delete method: " + name);
			
			return new Greeting(counter.incrementAndGet(), String.format(name, name));}
		
	

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

	private Person[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private void save(Person person) {
		// TODO Auto-generated method stub
		
	}
}