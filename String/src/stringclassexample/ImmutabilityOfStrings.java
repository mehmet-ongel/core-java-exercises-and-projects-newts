package stringclassexample;

public class ImmutabilityOfStrings {

	public static void main(String[] args) {
		
		int age = 20;
		age++;
		System.out.println(age);//21
		
		String message = "Hello";
		System.out.println(System.identityHashCode(message));
		message = message.concat(" World");// Hello World
		System.out.println(System.identityHashCode(message));
		System.out.println(message);//Hello
		
		String s = "android";
		String s2 = s.toUpperCase();//ANDROID
		System.out.println(s);//android
		System.out.println(s2);

	}

}
