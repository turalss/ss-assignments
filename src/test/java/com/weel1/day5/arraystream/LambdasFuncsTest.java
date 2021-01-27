package com.weel1.day5.arraystream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.week1.day5.arraystream.LambdasFuncs;

public class LambdasFuncsTest {
	
	List<String> actualArr = Arrays.asList("cou", "blo", "m", "alo", "cou", "Amor", "test");
	
	@Test
	public void testOrderAscByLengthSuccess() {
		List<String> expectedArr = Arrays.asList("m", "cou", "blo", "alo", "cou", "Amor", "test");
		assertEquals(LambdasFuncs.orderAscByLength(actualArr), expectedArr);
	}
	
	@Test
	public void testOrderAscByLengthFailure() {  
		List<String> unexpectedArr = Arrays.asList("m", "cou", "blo", "alo", "cou", "Amor", "test");
		assertNotEquals(LambdasFuncs.orderAscByLength(unexpectedArr), actualArr);
	}
	
	@Test
	public void testOrderDescByLengthSuccess() {
		List<String> expectedArr = Arrays.asList("Amor", "test", "cou", "blo", "alo", "cou", "m");		
		assertEquals(LambdasFuncs.orderDescByLength(actualArr), expectedArr);
	}
	
	@Test
	public void testOrderDescByLengthFailure() {
		List<String> unexpectedArr = Arrays.asList("m", "cou", "blo", "alo", "cou", "Amor", "test");		
		assertNotEquals(LambdasFuncs.orderDescByLength(actualArr), unexpectedArr);
	}
	
	@Test
	public void testAlphabeticallyOrderSuccess() {
		List<String> expectedArr = Arrays.asList("alo", "Amor", "blo", "cou", "cou", "m", "test");		
		assertEquals(LambdasFuncs.alphabeticallyOrder(actualArr), expectedArr);
	}
	
	@Test
	public void testAlphabeticallyOrderFailure() {
		List<String> unexpectedArr = Arrays.asList("m", "cou", "blo", "alo", "cou", "Amor", "test");		
		assertNotEquals(LambdasFuncs.alphabeticallyOrder(actualArr), unexpectedArr);
	}
	
	@Test
	public void testSortFirstWithESuccess() {
		List<String> expectedArr = Arrays.asList("test", "cou", "blo", "m", "alo", "cou", "Amor");		
		assertEquals(LambdasFuncs.sortFirstWithE(actualArr), expectedArr);
	}
	
	@Test
	public void testSortFirstWithEFailure() {
		List<String> expectedArr = Arrays.asList("cou", "test", "blo", "m", "alo", "cou", "Amor");		
		assertNotEquals(LambdasFuncs.sortFirstWithE(actualArr), expectedArr);
	}
	
	@Test
	public void testAddEandOwithCommaSuccess() {
		List<Integer> actualArr = Arrays.asList(3, 44, 1, 19);
		String expected = "o3,e44,o1,o19";
		assertEquals(LambdasFuncs.addEandOwithComma(actualArr), expected);
	}
	
	@Test
	public void testAddEandOwithCommaFailure() {
		List<Integer> actualArr = Arrays.asList(3, 44, 1, 19);
		String notExpected = "o3,e44,o1,19";
		assertNotEquals(LambdasFuncs.addEandOwithComma(actualArr), notExpected);
	}
	
	@Test
	public void testContainsAandLength3Success() {
		List<String> expectedArr = Arrays.asList("alo");	
		assertEquals(LambdasFuncs.containsAandLength3(actualArr), expectedArr);
	}
	
	@Test
	public void testContainsAandLength3Failure() {
		List<String> notExpectedArr = Arrays.asList("alo", "cou");	
		assertNotEquals(LambdasFuncs.containsAandLength3(actualArr), notExpectedArr);
	}
	
	

}

// [test, cou, blo, m, alo, cou, Amor