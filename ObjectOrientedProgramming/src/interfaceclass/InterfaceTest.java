package interfaceclass;

public class InterfaceTest {

	public static void main(String[] args) {

		Bird bird = new Bird();
		bird.canEat();
		bird.canDrink();
		bird.canFly();
		
		System.out.println("---------------");
		
		People people = new People();
		people.canEat();
		people.canDrink();
		
	}

}
