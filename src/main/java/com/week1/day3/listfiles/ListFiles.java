package com.week1.day3.listfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 *  Piece of software that will display list of all file and/or directory names under the given directory 
 */
class ListFiles {

	public static void main(String[] args) {

		ListFiles listFiles = new ListFiles();
		listFiles.listAllFilesInGivenDirectory("somepath");

	}

	public void listAllFilesInGivenDirectory(String path) {

		// looping through given directory path and printing files/directory names
		try {
			Files.list(Paths.get(path)).forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
