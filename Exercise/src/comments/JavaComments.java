package comments;

public class JavaComments {

	/*
	 This is the multi line comment
	 Compiler ignores these lines
	 */
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Prints Hello Java Developers
		//This is the single line comment in Java
		System.out.println("Hello Java Developers");//to shortcut: Ctrl + 7
		
		/*
		int x = 4;
		int y = 3;
		int z = 0;
		
		z = x + y;
		
		System.out.println(z);*/
		
		doMultiplication(0, 0);

	}
	
	/**
	 * This method multiplies two integer values
	 * @param x is the first parameter
	 * @param y is the second parameter
	 * @return This method returns the multiplication of the x and y
	 */
	public static int doMultiplication(int x, int y) {
		
		return x*y;
		
	}
	

}
