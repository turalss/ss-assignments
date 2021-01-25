package com.weel1.day4.line;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(LineTest.class);
		
		for(Failure failure : result.getFailures()) {
			// print failure tests
			System.out.println(failure.toString());
		}
		
		// returns boolean if all tests are successfully passed a test. 
		System.out.println(result.wasSuccessful());
	}

}
