package calculatorwithlambda;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		double number1 = scanner.nextDouble();
		
		System.out.println("Please enter the second number:");
		double number2 = scanner.nextDouble();
		
		Calculator calculator = new Calculator();
		
		calculator.calculate(number1, number2, (x, y) -> {
			
			System.out.println(x + " + " + y + " = " + (x + y));
			System.out.println(x + " - " + y + " = " + (x - y));
			System.out.println(x + " * " + y + " = " + (x * y));
			
			if (y == 0) {
				System.out.println(x + " / " + y + " = Divisor can't be zero!");
			} else {
				System.out.println(x + " / " + y + " = " + (x / y));
			}
			
			
		});
		
		scanner.close();

	}

}
