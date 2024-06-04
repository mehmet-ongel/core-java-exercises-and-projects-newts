package packagetest;

//Built-in package
import java.util.Scanner;

//User-defined package
import packageoperation.*;

import packageoperationtwo.Sum;

public class MainTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number:");
		int number1 = input.nextInt();
		System.out.println("Enter the second number:");
		int number2 = input.nextInt();
		
		packageoperation.Sum sum = new packageoperation.Sum();
		System.out.println(number1 + " + " + number2 + " = " + sum.sumNumbers(number1, number2));
		
		Multiply multi = new Multiply();
		System.out.println(number1 + " * " + number2 + " = " + multi.multiplyNumbers(number1, number2));
		
		//name conflict
		//packageoperationtwo.Sum

	}

}
