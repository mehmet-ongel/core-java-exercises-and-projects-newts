package loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		/*
		int x = 0;
		while(x < 6) {//1 < 6 6 < 6 -> false
			
			System.out.println(x);//0 1 2 3 4 5
			x++;//1
			
		}
		
		String[] animals = {"Cat","Dog","Horse","Cow"};
		int i = 0;
		while(i < animals.length) {
			
			System.out.println("animals[" + i + "] = " + animals[i]);
			i++;
			
		}*/
		
		
		//Factorial
		//n! = n*(n-1)*(n-2)*....*1
		//3! = 3 * 2 * 1 = 6
		//5! = 5 * 4 * 3 * 2 * 1 = 120
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = scanner.nextInt();
		if(number < 0) {
			System.out.println(number + "! is undefined.");
		}else if(number == 0 || number == 1) {
			System.out.println(number + "! = 1");
		}else {
			long result = 1;
			int enteredNumber = number;
			while(number > 0) {
				result *= number;
				number--;
			}
			System.out.println(enteredNumber + "! = " + result);
		}
		
		scanner.close();
		
	}

}







