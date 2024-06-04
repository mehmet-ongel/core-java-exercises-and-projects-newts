package lambdaexpression;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateInterfaceExample {

	public static void main(String[] args) {
		
		/*
		Predicate<String> p0 = s -> (s.equals("Java"));
		boolean result0 = p0.test("java");
		System.out.println("result0 = " + result0);
		
		Predicate<Integer> p1 = i -> (i < 10);
		boolean result1 = p1.test(5);
		System.out.println("result1 = " + result1);
		
		Predicate<Integer> p2 = m -> m > 5;
		//boolean result2 = p1.and(p2).test(7);
		boolean result2 = p1.or(p2).test(7);
		System.out.println("result2 = " + result2);
		
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Ant");
		animals.add("Lion");
		
		System.out.println("animals = " + animals);
		
		animals.removeIf(animal -> (animal.equals("Ant")));
		
		System.out.println("Last version of animals = " + animals);
		
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int enteredNumber = scanner.nextInt();
		
		if (isEven(enteredNumber, n -> n % 2 == 0)) {
			
			System.out.println(enteredNumber + " is an even number.");
			
		} else {

			System.out.println(enteredNumber + " is an odd number.");
			
		}
		
		scanner.close();	

	}
	
	public static boolean isEven(int number, Predicate<Integer> p) {
		
		return p.test(number);
		
	}

}


























