package com.mightyjava.type1;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CalculatorClient {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new CalculatorModule());
		Calculator calculator = injector.getInstance(Calculator.class);
		System.out.println("Addition : " + calculator.addition(100, 200));
		System.out.println("Substraction : " + calculator.substraction(400, 200));
		System.out.println("Multiply : " + calculator.multiply(15, 20));
		System.out.println("Division : " + calculator.division(400, 200));
	}
}
