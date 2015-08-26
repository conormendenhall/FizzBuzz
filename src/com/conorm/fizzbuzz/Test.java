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
		String expected = "1";
		assertEquals(expected, actual);
	}
	
	@org.junit.Test
	public void number2ShouldReturnString2() {
		assertEquals("2", fb.convert(2));
	}
	
	@org.junit.Test
	public void number3ShouldReturnFizz() {
		assertEquals("Fizz", fb.convert(3));
	}
	
	@org.junit.Test
	public void number5ShouldReturnBuzz() {
		assertEquals("Buzz", fb.convert(5));
	}
	
	@org.junit.Test
	public void number6ShouldReturnFizz() {
		assertEquals("Fizz", fb.convert(6));
	}
	
	@org.junit.Test
	public void number10ShouldReturnBuzz() {
		assertEquals("Buzz", fb.convert(10));
	}
	
	@org.junit.Test
	public void number15ShouldReturnFizzBuzz() {
		assertEquals("FizzBuzz", fb.convert(15));
	}
	
	@org.junit.Test
	public void number30ShouldReturnFizzBuzz() {
		assertEquals("FizzBuzz", fb.convert(30));
	}
}