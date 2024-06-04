package anonymousclasses;

public class Cheetah implements Animals {

	@Override
	public void show(String name, int speed) {
		
		System.out.println("A " + name + " can reach speeds of " + speed + " kilometers per hour.");
		
	}

}
