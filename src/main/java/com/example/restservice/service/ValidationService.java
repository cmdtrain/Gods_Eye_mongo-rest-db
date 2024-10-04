package com.example.restservice.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.restservice.domain.Person;
import com.example.restservice.exception.PersonValidationException;

@Service
public class ValidationService {
    public void validate(Person person) throws PersonValidationException {
        if (person == null) {
            throw new PersonValidationException("Person cannot be null");
        }

        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        String profession = person.getProfession();
        Date dateOfBirth = person.getDateOfBirth();

        if (firstName == null || firstName.isEmpty()) {
            throw new PersonValidationException("First name cannot be empty");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new PersonValidationException("Last name cannot be empty");
        }
        if (profession == null || profession.isEmpty()) {
            throw new PersonValidationException("Profession cannot be empty");
        }
        if (dateOfBirth == null ) {
            throw new PersonValidationException("Date of birth cannot be empty");
        }
    }
}