package com.conorm.fizzbuzz;

public class FizzBuzz {

	public static void main (String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(convert(i));
		}
	}
	
	public static String convert(int number) {
		if (isMultipleOf3(number) && isMultipleOf5(number)) {
			return "FizzBuzz";
		} else if (isMultipleOf3(number)) {
			return "Fizz";
		} else if (isMultipleOf5(number)) {
			return "Buzz";
		} else {
			return Integer.toString(number);
		}
	}

	private static boolean isMultipleOf5(int number) {
		return number % 5 == 0;
	}

	private static boolean isMultipleOf3(int number) {
		return number % 3 == 0;
	}

}
