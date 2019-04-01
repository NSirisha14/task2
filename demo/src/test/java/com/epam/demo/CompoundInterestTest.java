package com.epam.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompoundInterestTest {

	@Test
	public void compoundInterestTest() {
		CompoundInterest ci=new CompoundInterest();
		assertEquals(16288.95, ci.compoundInterest(10000, 10.25, 5), 0.0);
		assertEquals(1333.1, ci.compoundInterest(1200, 5.4, 2), 0.0);
	}

}