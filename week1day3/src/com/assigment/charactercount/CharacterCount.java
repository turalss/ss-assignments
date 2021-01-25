package com.assigment.charactercount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
 *  This piece of software will return a number of times given characters appears in a given file. 
 */

class CharacterCount {

	public static void main(String[] args) {

		int count = 0;
		String line;

		// reads file in a given path
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("somepath/index.txt"))) {

			String value = args[0];

			// setting pattern to use Matcher
			Pattern pattern = Pattern.compile(value);

			// initializing line if next() line exist in file
			while ((line = bufferedReader.readLine()) != null) {

				// checking if given pattern exists in given line
				Matcher match = pattern.matcher(line);

				while (match.find()) {
					count++;
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// printing the result
		System.out.println("Matched " + count + " times");
	}
}
