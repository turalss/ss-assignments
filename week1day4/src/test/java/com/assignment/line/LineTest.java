package com.assignment.line;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LineTest {
	
	
	Line line = new Line(5, 5, 2, 2);
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	
	/*******************************************************************
	 * Question 1
	 * 
	 * calculate the slope of the line
	 ******************************************************************/

	@Test
	public void testGetSlopeSuccess() {  
		assertEquals(1.1, line.getSlope(), 1.1);
	}
	
	@Test
	public void testGetSloperFailure() { 
		assertNotEquals(2.0, line.getSlope());
	}
	
	@Test(expected = ArithmeticException.class)
	public void testGetSloperExpectedException() { 
		Line newLine = new Line(5, 5, 0, 2);
		assertEquals(1.1, newLine.getSlope(), 1.1);;
	}
	
	/*******************************************************************
	 * Question 2
	 * 
	 * calculate the distance of the line
	 ******************************************************************/
	
	@Test
	public void testGetDistanceSuccess() {
		assertEquals(4.242640687119285, line.getDistance(), 4.242640687119285);
	}
	
	@Test
	public void testGetDistanceFailure() { 
		assertNotEquals(2.0, line.getDistance());
	}
	
	
	
	
	
	
	

}
