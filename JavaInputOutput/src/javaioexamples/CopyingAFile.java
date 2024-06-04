package javaioexamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class CopyingAFile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a file name:");
		String newFileName = scanner.nextLine();
		
		try {
			Reader reader = new FileReader("C:\\Users\\mehme\\Documents\\input-output\\oak academy.txt");
			Writer writer = new FileWriter("C:\\Users\\mehme\\Documents\\input-output\\" + newFileName + ".txt");
			
			if (reader.ready()) {
				
				System.out.println("Data is reading...");
				
				int characterRead;
				
				do {
					
					characterRead = reader.read();
					if (characterRead != -1) {
						
						writer.write(characterRead);
						
					}
					
				} while (characterRead != -1);
				
				System.out.println("The file copied.");
				
			}
			
			reader.close();
			writer.close();
			scanner.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}







