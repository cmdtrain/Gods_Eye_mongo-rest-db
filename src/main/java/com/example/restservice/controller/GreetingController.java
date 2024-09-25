package com.example.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.domain.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	
		
	@GetMapping("/smthing smart1")
	public Greeting get(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("get method: " + name);
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));}
	
	@PostMapping("/smthing smart2")
	public Greeting create(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("create method: " + name);
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));}
	
	@PatchMapping("/smthing smart3")
	public Greeting update(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("update method: " + name);
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));}
	
	@DeleteMapping("/smthing smart4")
	public Greeting delete(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("delete method: " + name);
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));}
	
} 

//post, delete, patch