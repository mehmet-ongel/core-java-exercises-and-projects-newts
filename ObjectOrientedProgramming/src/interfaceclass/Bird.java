package interfaceclass;

public class Bird implements CanFed, CanFly {

	@Override
	public void canFly() {
		System.out.println("Birds can fly.");
	}

	@Override
	public void canEat() {
		System.out.println("Birds can eat birdseed.");
	}

	@Override
	public void canDrink() {
		System.out.println("Birds can drink water.");
	}

}
