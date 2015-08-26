package com.conorm.fizzbuzz;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void shouldBeFizzBuzzClass() {
		FizzBuzz fb = new FizzBuzz();
	}	

	@org.junit.Test
	public void shouldConvert() {
		FizzBuzz fb = new FizzBuzz();
		fb.convert(1);
	}
}