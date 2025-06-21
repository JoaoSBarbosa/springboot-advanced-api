package com.joaobarbosadev.springboot_advanced_api.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.joaobarbosadev.springboot_advanced_api.model.Greetings;

@RestController
@RequestMapping("/grettings")
public class GrettingController {
	
	private final static String template = "Hello, %S!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping
	public ResponseEntity<Greetings> gretting(@RequestParam String name){
		
		Greetings greeting = new Greetings(counter.incrementAndGet(), String.format(template, name));
		return ResponseEntity.ok(greeting);
	}

}
