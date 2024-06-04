package loop;

import java.util.Random;
import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		
		//Number Guessing App
		Random random = new Random();
		int generatedNumber = random.nextInt(5,100);//smallest number is 5, largest number is 99
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number between 5 and 100");
		while(true) {
			
			int userInput = scanner.nextInt();
			
			if(userInput > generatedNumber) {
				System.out.println("Decrease your guess.");
			}else if(userInput < generatedNumber) {
				System.out.println("Increase your guess.");
			}else {
				System.out.println("Congratulations...");
				break;
			}
			
		}
		
		scanner.close();
		
		
		
		
		/*
		final boolean isChecked = true;
		
		while(isChecked) {
			System.out.println("This is an infinite (endless) loop.");
		}
		
		int a = 5;
		
		final boolean isFalse = false;
		
		while(isFalse) {
			
		}*/
		
	}

}
