package com.weel1.week1assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.week1.week1assignment.Week1Assigment;

public class Week1AssigmentTest {
	
	@Test
	public void testIsOddSuccessEven() {
		assertEquals(Week1Assigment.isOdd().apply(4), "EVEN");
	}
	
	@Test
	public void testIsOddSuccessOdd() {
		assertEquals(Week1Assigment.isOdd().apply(5), "ODD");
	}
	
	@Test
	public void testIsPrimeSuccessPrime() {
		assertEquals(Week1Assigment.isPrime().apply(5), "PRIME");
	}
	
	@Test
	public void testIsPrimeSuccessComposite() {
		assertEquals(Week1Assigment.isPrime().apply(6), "COMPOSITE");
	}
	
	@Test
	public void testIsPalindromeSuccessPalidrome() {
		assertEquals(Week1Assigment.isPalindrome().apply(898), "PALIDROME");
	}
	
	@Test
	public void testIsPalindromeNotSuccessPalidrom() {
		assertEquals(Week1Assigment.isPalindrome().apply(877), "NOT PALIDROME");
	}
	
	@Test
	public void testRightMostSuccess() {
		List<Integer> actual = Arrays.asList(16, 8, 886, 8, 1);
		List<Integer> expected = Arrays.asList(6, 8, 6, 8, 1);
		assertEquals(Week1Assigment.rightMost(actual), expected);
	}
	
	@Test
	public void testMultipliedBy2Success() {
		List<Integer> actual = Arrays.asList(2, 4, 6);
		List<Integer> expected = Arrays.asList(4, 8, 12);
		assertEquals(Week1Assigment.multipliedBy2(actual), expected);
	}
	
	@Test
	public void testRemoveXSuccess() {
		List<String> actual = Arrays.asList("xa", "lu", "xox");
		List<String> expected = Arrays.asList("a", "lu", "o");
		assertEquals(Week1Assigment.removeX(actual), expected);
	}
	
	@Test
	public void testGroupSumClumpSuccess1() {
		int start = 0;
		int[] arr = {2, 4, 8};
		int end = 14;
		assertEquals(Week1Assigment.groupSumClump(start, arr, end), true);
	}
	
	@Test
	public void testGroupSumClumpFailure() {
		int start = 0;
		int[] arr = {2, 4, 4, 8};
		int end = 14;
		assertEquals(Week1Assigment.groupSumClump(start, arr, end), false);
	}
	
	@Test
	public void testGroupSumClumpSuccess2() {
		int start = 0;
		int[] arr = {1, 2, 4, 8, 1};
		int end = 14;
		assertEquals(Week1Assigment.groupSumClump(start, arr, end), true);
	}
	
	
	

}
