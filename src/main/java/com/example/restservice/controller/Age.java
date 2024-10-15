package com.example.restservice.controller;

import java.time.LocalDate;
import java.time.Period;

public class Age {

public static int calculateAge(LocalDate dateOfBirth, LocalDate currentDate) {
if ((dateOfBirth != null) && (currentDate != null)) {
return Period.between(dateOfBirth, currentDate).getYears();
} else {
return 0;
}
}
}
