package com.conorm.fizzbuzz;

public class FizzBuzz {

	public String convert(int number) {
		if (isMultipleOf3(number)) return "Fizz";
		else if (number == 5) return "Buzz";
		return Integer.toString(number);
	}

	private boolean isMultipleOf3(int number) {
		return number % 3 == 0;
	}

}
