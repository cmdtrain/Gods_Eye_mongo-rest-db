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

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("Greeting method");
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
		
	
	}
	@GetMapping("/hello")
	public Greeting hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("hello method: " + name);
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));}
	
	@PostMapping("/hello")
	public Greeting post(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("post method: " + name);
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));}
	
	@PatchMapping("/hello")
	public Greeting patch(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("patch method: " + name);
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));}
	
	@DeleteMapping("/hello")
	public Greeting delete(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("delete method: " + name);
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));}
	
} 

//post, delete, patch