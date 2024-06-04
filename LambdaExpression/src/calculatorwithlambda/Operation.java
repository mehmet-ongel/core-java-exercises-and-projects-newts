package calculatorwithlambda;


@FunctionalInterface
public interface Operation {
	
	void performOperation(double x, double y);

}
