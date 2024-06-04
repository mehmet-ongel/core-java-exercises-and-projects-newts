package staticexample;

public class Car {

	public static int currentSpeed = 0;
	public static int maxSpeed = 180;

	public static void showSpeed(int speed) {

		System.out.println("Your speed is : " + speed);

	}

	public static void speedUp(int increase) {

		currentSpeed += increase;
		if (currentSpeed > maxSpeed) {
			showSpeed(currentSpeed);
			System.out.println("Please slow down");
		} else {
			showSpeed(currentSpeed);
		}

	}

	public static void speedDown(int decrease) {

		currentSpeed -= decrease;
		showSpeed(currentSpeed);
	}
	
	public static void stop() {
		currentSpeed = 0;
		showSpeed(currentSpeed);
	}

}
