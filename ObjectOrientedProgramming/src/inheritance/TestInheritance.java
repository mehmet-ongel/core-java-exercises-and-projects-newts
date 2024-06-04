package inheritance;

public class TestInheritance {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat("Dogs");
		dog.drink("Dogs");
		dog.breath("Dogs");
		dog.move("Dogs");
		dog.bark();
		dog.numberOfLegs = 4;
		dog.printLegs();
		
		System.out.println("------------------");
		
		Bird bird = new Bird();
		bird.eat("Birds");
		bird.drink("Birds");
		bird.breath("Birds");
		bird.move("Birds");
		bird.fly();
		bird.numberOfLegs = 2;
		bird.printLegs();
		
	}

}
