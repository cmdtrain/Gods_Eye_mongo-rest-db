package com.example.restservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import com.example.restservice.Person;
import com.example.restservice.repository.PersonRepository;

public class CustomerService {

	  @Autowired
	  private CustomerService PersonRepository;

	  public static void main(String[] args) {
	    SpringApplication.run(PersonRepository.class, args);
	  }

	  public void run(String... args) throws Exception {

	    PersonRepository.deleteAll();

	    // save a couple of customers
	    PersonRepository.save(new Person("A", "S"));
	    PersonRepository.save(new Person("B", "S"));

	    // fetch all customers
	    System.out.println("Customers found with findAll():");
	    System.out.println("-------------------------------");
	    for (Person customer : PersonRepository.findAll()) {
	      System.out.println(customer);
	    }
	    System.out.println();

	    // fetch an individual customer
	    System.out.println("Customer found with findByFirstName('A'):");
	    System.out.println("--------------------------------");
	    System.out.println(PersonRepository.findByFirstName("A"));

	    System.out.println("Customers found with findByLastName('S'):");
	    System.out.println("--------------------------------");
	    for (Person customer : PersonRepository.findByLastName("S")) {
	      System.out.println(customer);
	    }

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

	private Person[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private void save(Person person) {
		// TODO Auto-generated method stub
		
	}
}