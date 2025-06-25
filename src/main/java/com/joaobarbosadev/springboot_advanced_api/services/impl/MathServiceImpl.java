package com.joaobarbosadev.springboot_advanced_api.services.impl;

import org.springframework.stereotype.Service;

import com.joaobarbosadev.springboot_advanced_api.services.MathService;

@Service
public class MathServiceImpl implements MathService {

	@Override
	public Double adding(String numberOne, String numberTwo) {

		chekingField(numberOne, numberTwo);
		return conveterToDouble(numberOne) + conveterToDouble(numberTwo);
	}

	@Override
	public Double subtracting(String numberOne, String numberTwo) {
		chekingField(numberOne, numberTwo);
		return conveterToDouble(numberOne) - conveterToDouble(numberTwo);
	}

	@Override
	public Double division(String numberOne, String numberTwo) {
		chekingField(numberOne, numberTwo);
		return conveterToDouble(numberOne) / conveterToDouble(numberTwo);
	}

	@Override
	public Double multiplication(String numberOne, String numberTwo) {
		chekingField(numberOne, numberTwo);
		return conveterToDouble(numberOne) * conveterToDouble(numberTwo);
	}

	@Override
	public Double everage(String numberOne, String numberTwo) {
		chekingField(numberOne, numberTwo);
		return (conveterToDouble(numberOne) + conveterToDouble(numberTwo)) / 2;
	}

	@Override
	public Double squareRoot(String number) {
		chekingOneField(number);
		return Math.sqrt(conveterToDouble(number));
	}

	private boolean isNumeric(String strNumber) {
		if (strNumber == null || strNumber.isEmpty())
			return false;
		String number = strNumber.replace(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");

	}

	private Double conveterToDouble(String number) {
		if (number == null || number.isEmpty()) {
			throw new IllegalArgumentException("Valor vazio");
		}
		return Double.parseDouble(number);
	}

	private void chekingField(String numberOne, String numberTwo) {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo))
			throw new IllegalArgumentException("Falha na operação");

	}
	
	private void chekingOneField(String number) {
		if (!isNumeric(number))throw new IllegalArgumentException("Falha na operação");

	}

}
