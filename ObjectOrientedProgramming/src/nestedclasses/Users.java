package nestedclasses;

public class Users {

	static String person1 = "Jhon";
	private static String person2 = "David";
	public String person3 = "Andy";
	
	//inner class (non-static nested class)
	class InnerUser{
		
		void show() {
			
			System.out.println("Person1 = " + person1);
			System.out.println("Person2 = " + person2);
			System.out.println("Person3 = " + person3);
			
		}
		
	}
	
}
