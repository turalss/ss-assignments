package com.assigment.appendtext;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 *  Piece of software that will append the given text to the given file in the directory 
 */

class AppendText {

	public static void main(String[] args) {

		AppendText appendText = new AppendText();
		appendText.append("somepath/index.txt", "this. assignment completed successfully");

	}

	// this method takes 2 parameters. path to the file and text that should be
	// appended in the file
	public void append(String path, String text) {

		// passing the file to BufferWritter so it doesn't compile the value to
		// bytes
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {

			// appending text
			writer.write(text);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
