package calculatorwithlambda;

public class Calculator {
	
	public void calculate(double x, double y, Operation operation) {
		
		operation.performOperation(x, y);
		
	}

}
