package com.example.restservice.exception;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonValidationException extends Exception { 
    public PersonValidationException(String errorMessage) {
        super(errorMessage);
        }
    
    
    }