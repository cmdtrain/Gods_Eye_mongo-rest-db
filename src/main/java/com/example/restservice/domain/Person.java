package com.example.restservice.domain;

import org.springframework.data.annotation.Id;

public class Person {

	  @Id
	  private String id;
	  
	  // Method 1 - Getter
	    public String getId() { return id; }
	 
	    // Method 2 - Setter
	    public void setId(String id)
	    {
	 
	        // This keyword refers to current instance itself
	        this.id = id;
	    }

	  private String firstName;
	  // Method 1 - Getter
	    public String getfirstName() { return firstName; }
	 
	    // Method 2 - Setter
	    public void setfirstName(String firstName)
	    {
	 
	        // This keyword refers to current instance itself
	        this.firstName = firstName;
	    }
	  private String lastName;
	  // Method 1 - Getter
	    public String getlastName() { return lastName; }
	 
	    // Method 2 - Setter
	    public void setlastName(String lastName)
	    {
	 
	        // This keyword refers to current instance itself
	        this.lastName = lastName;
	    }

	  public Person() {}

	  public Person(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%s, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  }

	}
