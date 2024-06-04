package loop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int result = 0;
		char continueToCalculate;
		
		do {
			
			System.out.println("Enter a number:");
			int number = input.nextInt();
			result += number;//result = result + number
			System.out.println("Do you want to continue? (Y / N):");
			continueToCalculate = input.next().charAt(0);
			
			
		} while (continueToCalculate == 'Y' || continueToCalculate == 'y');
		
		System.out.println("The sum of the numbers are " + result);
		System.out.println("-------- The program is terminated. --------");
		input.close();
		
		
		
		
		/*
		int age = 15;
		
		do {
			age--;//14
			System.out.println("age in do block: " + age);
			
			while(age < 20) {//true
				age++;//15
				System.out.println("age in while loop: " + age);
			}
			
		} while (age < 15);//false 20 > 15
		
		System.out.println("age: " + age);//20
		
		
		
		
		
		int i = 5;
		do {
			System.out.println(i);
			i--;
		}while(i > 5);
		
		System.out.println("last value of i: " + i);*/
		
		

	}

}
