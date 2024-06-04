package staticexample;

import static staticexample.Employee.*;
import static java.lang.Math.*;
import static java.lang.System.out;


public class Test {

	public static void main(String[] args) {

		/*
		 * static keyword
		Car.speedUp(60);
		Car.speedUp(160);
		Car.speedDown(50);
		Car.stop();
		
		Car obj = new Car();
		obj.speedUp(40);*/
		
		//static import
		showSalary(currentSalary);
		increase(500);
		
		//Math class
		out.println(min(20, 30));
		out.println(pow(3, 2));//3^2
				
	}

}
