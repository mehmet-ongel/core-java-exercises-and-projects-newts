package packageone;

public class Cat {

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		myCat.publicMethod();
		myCat.protectedMethod();
		myCat.defaultMethod();
		myCat.privateMethod();

	}
	
	private void privateMethod() {
		System.out.println("This is private modifier");
	}
	
	void defaultMethod() {
		System.out.println("This is default modifier");
	}
	
	protected void protectedMethod() {
		System.out.println("This is protected modifier");
	}
	
	public void publicMethod() {
		System.out.println("This is public method");
	}
}
