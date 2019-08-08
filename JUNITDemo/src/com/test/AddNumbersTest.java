package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddNumbersTest {

	@Test
	void test() {
		AddNumbers addNumber = new AddNumbers();
		
assertEquals(20,addNumber.sum(5, 7, 8) );	}

}
