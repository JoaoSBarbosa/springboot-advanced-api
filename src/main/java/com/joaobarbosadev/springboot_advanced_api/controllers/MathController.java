package com.joaobarbosadev.springboot_advanced_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaobarbosadev.springboot_advanced_api.services.MathService;

@RestController
@RequestMapping("/maths")
public class MathController {

	private final MathService mathService;
	
	public MathController(MathService mathService) {
		this.mathService = mathService;
	}
	
	
	@GetMapping("/addition/{numberOne}/{numberTwo}")
	public ResponseEntity<Double> addition(
			@PathVariable String numberOne,
			@PathVariable String numberTwo
			){
		
		Double result = mathService.adding(numberOne, numberTwo);
		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping("/subtracting/{numberOne}/{numberTwo}")
	public ResponseEntity<Double> subtracting(
			@PathVariable String numberOne,
			@PathVariable String numberTwo
			){
		
		Double result = mathService.subtracting(numberOne, numberTwo);
		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping("/multiplication/{numberOne}/{numberTwo}")
	public ResponseEntity<Double> multiplication(
			@PathVariable String numberOne,
			@PathVariable String numberTwo
			){
		
		Double result = mathService.multiplication(numberOne, numberTwo);
		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping("/division/{numberOne}/{numberTwo}")
	public ResponseEntity<Double> division(
			@PathVariable String numberOne,
			@PathVariable String numberTwo
			){
		
		Double result = mathService.division(numberOne, numberTwo);
		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping("/everage/{numberOne}/{numberTwo}")
	public ResponseEntity<Double> everage(
			@PathVariable String numberOne,
			@PathVariable String numberTwo
			){
		
		Double result = mathService.everage(numberOne, numberTwo);
		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping("/square_root/{number}")
	public ResponseEntity<Double> squareRoot(
			@PathVariable String number
			){
		
		Double result = mathService.squareRoot(number);
		return ResponseEntity.ok().body(result);
	}
}
