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
	public Long getProfession() {
		return profession;
	}
	public void setProfession(Long profession) {
		this.profession = profession;
	}

}
