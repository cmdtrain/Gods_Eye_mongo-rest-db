package com.example.accessingmongodbdatarest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.restservice.Greeting;
import com.example.restservice.RestServiceApplication;

public class Person {

  @Id private String id;

  private String firstName;
  private String lastName;

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
}


private static final String template = "Hello, %s!";
private final AtomicLong counter = new AtomicLong();

@GetMapping("/greeting")
public Greeting greeting(@RequestParam(value = "firstName" + "lastName", defaultValue = "World") String name) {
	return new Greeting(counter.incrementAndGet(), String.format(template, name));
}

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);}}
 




    private String rollNo;
    private String name;
 
    public String getRollNo() {
        return rollNo;
    }
 
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

 
class PersonView {
    public void printPersonDetails(String personName, String personRollNo) {
        System.out.println("Person");
        System.out.println("Name: " + firstName);
        System.out.println("Roll No: " + rollNo);
    }
}
 
class PersonController {
    private Person model;
    private PersonView view;
 
    public PersonController(Person model, PersonView view) {
        this.model = model;
        this.view = view;
    }
 
    public void setPersonName(String name) {
        model.setName(name);
    }
 
    public String getPersonName() {
        return model.getName();
    }
 
    public void setPersonRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }
 
    public String getPersonRollNo() {
        return model.getRollNo();
    }
 
    public void updateView() {
        view.printPersonDetails(model.getName(), model.getRollNo());
    }
}
 
public class MVCPattern {
    public static void main(String[] args) {
        Person model = retrivePersonFromDatabase();
 
        PersonView view = new PersonView();
 
        PersonController controller = new PersonController(model, view);
 
        controller.updateView();
 
        controller.setPersonName("Frodo Baggins");
 
        controller.updateView();
    }
 
    private static Person retrivePersonFromDatabase() {
        Person person = new Person();
        person.setName("Frodo Baggins");
        person.setRollNo("15UCS157");
        return person;
    }
}