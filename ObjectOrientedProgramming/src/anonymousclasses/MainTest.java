package anonymousclasses;

public class MainTest {

	public static void main(String[] args) {

		//Cheetah cheetah = new Cheetah();
		//cheetah.show("Cheetah", 90);
		
		//Anonymous class
		Animals animals = new Animals() {

			@Override
			public void show(String name, int speed) {
				
				System.out.println("A " + name + " can reach speeds of " + speed + " kilometers per hour.");
				
			}
			
		};
		
		animals.show("Cheetah", 90);
		
	}

}
