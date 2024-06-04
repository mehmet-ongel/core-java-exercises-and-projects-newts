package stringclassexample;

public class StringExample {

	public static void main(String[] args) {

		//String Literal
		String stringLiteral1 = "Hello Java Developers";
		String stringLiteral2 = "World";
		
		System.out.println(stringLiteral1.length());
		System.out.println(stringLiteral2);
		
		//String Object
		String stringObject1 = new String("Hello");
		String stringObject2 = new String("World");
		
		System.out.println(stringObject1);
		System.out.println(stringObject2);
		
		//concatenate string with + sign
		System.out.println(stringLiteral1 + " " + stringLiteral2);
		System.out.println(stringObject1 + " " + stringObject2);
		
		String concatenatedStringLiteral = stringLiteral1 + " " + stringLiteral2;
		String concatenatedStringObject = stringObject1 + " " + stringObject2;
		
		System.out.println(concatenatedStringLiteral);
		System.out.println(concatenatedStringObject);
		
		String stringNum1 = "3";
		String stringNum2 = "4";
		System.out.println(stringNum1 + stringNum2);//34
		
		int num1 = 5;
		int num2 = 6;
		
		System.out.println(num1 + num2);
		System.out.println(stringNum1 + num1);
		
		System.out.println(4 + 5 + "6");//4+5 = 9(int) + "6"(string) -> 96
		System.out.println(4 + "5" + 6);//45(string) + 6(int) -> 456
		System.out.println("4" + 5 + 6);//45(string) + 6(int) -> 456
		
		
	}

}















