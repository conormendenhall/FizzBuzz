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
}