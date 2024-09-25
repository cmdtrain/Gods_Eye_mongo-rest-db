package com.example.restservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Person {

	  @Id
	  private Long id;
	  private String firstName;
	  private String lastName;
	  
	  
	  
	  public Person(long l, String string) {}
	  Person(String firstName, String lastName, Long id) {}
	  
	  //Id
	    public Long getId(){ return id; }
	    public void setId(Long id)
	    {this.id = id;}

	    
	    
	  // first name
	    public String getFirstName(){ return firstName; }
	    public void setFirstName(String firstName)
	    {this.firstName = firstName;}
	    
	    
	    // last name
	    public String getLastName(){ return lastName; }
	    public void setLastName(String lastName)
	    {this.lastName = lastName;}
	  
	 

	  public Person(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.id = id;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Person [id=%s, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  }

	}
