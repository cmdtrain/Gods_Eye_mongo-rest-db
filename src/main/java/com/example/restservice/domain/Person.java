package com.example.restservice.domain;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.Period;

@Document
public class Person {

	@Id
	@JsonIgnore
	private String id;
	private String firstName;
	private String lastName;
	private String profession;
	private Date dateOfBirth;

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", profession=" + profession
				+ "]";
	}

	boolean active;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;

	}

	@JsonIgnore
	private int getAge(LocalDate dateOfBirth, LocalDate currentDate) {
		if ((dateOfBirth != null) && (currentDate != null)) {
			return Period.between(dateOfBirth, currentDate).getYears();
		} else {
			return 0;
		}
	}
}
