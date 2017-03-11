package com.mightyjava.type3;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CalculatorClient {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new CalculatorModule());
		CalculatorService calculatorService = injector.getInstance(CalculatorService.class);
		System.out.println("Addition : " + calculatorService.calculate(100, 200, "add"));
		System.out.println("Substraction : " + calculatorService.calculate(1000, 200, "sub"));
		System.out.println("Multiply : " + calculatorService.calculate(100, 200, "mul"));
		System.out.println("Division : " + calculatorService.calculate(1000, 200, "div"));
	}
}
