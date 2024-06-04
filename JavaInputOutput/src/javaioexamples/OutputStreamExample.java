package javaioexamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamExample {
	
	public static final String FILE_NAME = "example.txt";

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a text:");
		String inputText = scanner.nextLine();
		
		try {
			OutputStream outputStream = new FileOutputStream(FILE_NAME);
			byte[] inputTextAsByteArray = inputText.getBytes();
			outputStream.write(inputTextAsByteArray,5,11);
			
			System.out.println("Write operation was successful");
			
			outputStream.flush();
			outputStream.close();
			scanner.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
