package com.conorm.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;

public class Test {

	private FizzBuzz fb;

	@Before
	public void setUp() {
		fb = new FizzBuzz();
	}	

	@org.junit.Test
	public void shouldConvert() {
		fb.convert(1);
	}
	
	@org.junit.Test
	public void number1ShouldReturnString1() {
		String actual = fb.convert(1);
		assertEquals("1", actual);
	}
	
	@org.junit.Test
	public void number2ShouldReturnString2() {
		String actual = fb.convert(2);
		assertEquals("2", actual);
	}
	
	@org.junit.Test
	public void number3ShouldReturnFizz() {
		String actual = fb.convert(3);
		assertEquals("Fizz", actual);
	}
	
	@org.junit.Test
	public void number5ShouldReturnBuzz() {
		String actual = fb.convert(5);
		assertEquals("Buzz", actual);
	}
}