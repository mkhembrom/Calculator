package main;

import static org.junit.Assert.*;

import org.junit.Test;
import main.Calculator;

/*
 * CHANGING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF PROJECTS !!!
 * 
 */

public class TestingCalc {
	Calculator c;
	@SuppressWarnings("static-access")
	@Test
	public void mul_test() {
		c = null;
		assertEquals(6*5,c.mult(6,5));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void addition_test() {
		assertEquals(2+4,c.add(2,4));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void sub_test() {
		assertEquals(6-5,c.sub(6,5));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void div_test() {
		
		assertEquals(20/5,c.div(20,5));
	}

}