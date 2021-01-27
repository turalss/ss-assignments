package com.weel1.day5.datetimeapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.week1.day5.datetimeapi.DateTimeApi;

public class DateTimeApiTest {
	
	@Test
	public void testIsFriday13Success() {
		LocalDate date = LocalDate.of(2020, 11, 13);
		assertTrue(DateTimeApi.isFriday13().apply(date));
	}
	
	@Test
	public void testIsFriday13Failure () {
		LocalDate date = LocalDate.of(1990, 11, 23);
		assertFalse(DateTimeApi.isFriday13().apply(date));
	}
	
	@Test
	public void testNumOfDayForEachMonthSuccess() {
		List<Integer> expected = Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
		assertEquals(DateTimeApi.numOfDayForEachMonth(2020), expected);
	}
	
	@Test
	public void testNumOfDayForEachMonthFailure() { 
		List<Integer> notExpected = Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
		assertNotEquals(DateTimeApi.numOfDayForEachMonth(2020), notExpected);
	}
	




}
