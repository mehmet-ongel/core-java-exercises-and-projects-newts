package javaioexamples;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WriterExample {
	
	public static final String FILE_NAME = "test.txt";

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a text:");
		String inputText = scanner.nextLine();
		
		int indexOfW = inputText.indexOf("Writer");
		
		if (indexOfW != -1) {
			
			Writer writer = new FileWriter(FILE_NAME);
			writer.write(inputText,indexOfW,6);
			System.out.println("The text was written to the " + FILE_NAME);
			
			scanner.close();
			writer.close();
			
		}

	}

}
