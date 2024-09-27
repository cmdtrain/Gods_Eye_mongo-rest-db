package com.example.restservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {

	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private Long profession;

	public Person(long Number, String Person) {
	}

	Person(String firstName, String lastName, Long id) {
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Person [id=%s, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

	public Long profession() {
		return profession();
	}

	public void setprofession(Long profession) {
		this.profession = profession;
	}
}
