package staticexample;

public class Employee {
	
	public static int currentSalary = 1000;
	
	public static void showSalary(int salary) {
		
		System.out.println("Your salary is: $" + salary);
		
	}
	
	public static void increase(int raise) {
		
		System.out.println("You received $" + raise);
		currentSalary += raise;
		showSalary(currentSalary);
		
	}

}
