package com.week1.day1.guessnumber;

import java.util.Random;

/**
 * @author tural.hasanli
 * 
 *  Guessing game - where user inputs some numbers against valid range of numbers and receives an output 
 *  message if user guessed the right number. 
 *
 */

public class GuessNumber {
	
	public int countChance;
	public int randomNumber;
	
	// contractor to inject default parameters at instantiation 
	public GuessNumber() {
		this.countChance = 5;
		this.randomNumber = generateRandomNumber();
		
	}
	
	// generating a random number 
	public int generateRandomNumber() {
		Random random = new Random();
		
		int max = 100;
		int min = 1;
		
		int randomNumber = random.nextInt((max - min) + 1) + min;
		
		return randomNumber;
	}
	
	// takes int parameters and runs appropriate logic to validate if user's guessed number is the right one
	public void guessAnumber(int number) {
		int max = randomNumber + 10;
		int min = randomNumber - 10;
		
		if(countChance <= 1) {
			System.out.println("Sorry, game is over. The number is: " + randomNumber);
			System.exit(1);
			
		} else if(number <= max && number >= min) {
				System.out.println("Congratulation, the number is: " + randomNumber);
				System.exit(1);
				
		}  else {
			countChance--;
			System.out.println("ooops, that did't work. Please try again. You still have " + countChance + " attemps left.");
		}
	}
	
	
	// executing game 
	public static void main(String[] args) {
		
		// if one of the numbers wins programs stops
		// if user try to make a new guess after reaching max attempts(5) program doesn't execute the query
		
		// array of numbers (imaginary guessed by user) 
		int[] guessedNumbers = {1, 2, 3, 90, 100, 80};
		
		GuessNumber guessed = new GuessNumber();
		
		for(int number : guessedNumbers) {
			guessed.guessAnumber(number);
			
		}
	}
	

}