package com.weel1.day4.line;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.week1.day4.line.Line;

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
	
	/*******************************************************************
	 * Question 4
	 * 
	 * return weather line parallel to another
	 ******************************************************************/
	
	@Test
	public void testParallelToSuccess() {
		Line mLine = new Line(4, 4, 10, 10);
		assertTrue(line.paralellTo(mLine));
	}
	
	@Test
	public void testParallelToFailure() {
		Line mLine = new Line(5, 4, 10, 10);
		assertFalse(line.paralellTo(mLine));
	}
	
}
