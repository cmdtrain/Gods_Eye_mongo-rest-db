package com.example.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.domain.Person;
import com.example.restservice.service.counter;

@RestController
public class PersonController {

	
		
	private String template;

	@GetMapping("/getrequest")
	public Person get(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("get method: " + name);
		
		return new Person(counter.incrementAndGet(), String.format(template, name));}
	
	@PostMapping("/postrequest")
	public Person create(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("create method: " + name);
		
		return new Person(counter.incrementAndGet(), String.format(template, name));}
	
	@PatchMapping("/createrequest")
	public Person update(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("update method: " + name);
		
		return new Person(counter.incrementAndGet(), String.format(template, name));}
	
	@DeleteMapping("/deleterequest")
	public Person delete(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("delete method: " + name);
		
		return new Person(counter.incrementAndGet(), String.format(template, name));}
	
} 

//post, delete, patch