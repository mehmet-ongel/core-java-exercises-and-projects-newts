package stringclassexample;

import java.util.Arrays;

public class EqualityOfStrings {

	public static void main(String[] args) {
		
		// == equals()
		
		
		/*
		String s1 = new String("Hello Developers");
		String s2 = new String("Hello Developers");
		String s3 = "Hello Developers";
		String s4 = "Hello Developers";
		String s5 = "Hello" + " Developers";
		
		System.out.println("************* == ****************");
		System.out.println(s1 == s2);//false
		System.out.println(s1 == s3);//false
		System.out.println(s1 == s4);//false
		System.out.println(s1 == s5);//false
		System.out.println(s2 == s3);//false
		System.out.println(s2 == s4);//false
		System.out.println(s2 == s5);//false
		System.out.println(s3 == s4);//true
		System.out.println(s3 == s5);//true
		System.out.println(s4 == s5);//true
		
		//Sytem.identityHashCode()
		System.out.println("ID of s1: " + System.identityHashCode(s1));
		System.out.println("ID of s2: " + System.identityHashCode(s2));
		System.out.println("ID of s3: " + System.identityHashCode(s3));
		System.out.println("ID of s4: " + System.identityHashCode(s4));
		System.out.println("ID of s5: " + System.identityHashCode(s5));
		
		//equals()
		
		System.out.println("************* equals() ****************");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//true
		System.out.println(s1.equals(s5));//true
		System.out.println(s2.equals(s3));//true
		System.out.println(s2.equals(s4));//true
		System.out.println(s2.equals(s5));//true
		System.out.println(s3.equals(s4));//true
		System.out.println(s3.equals(s5));//true
		System.out.println(s4.equals(s5));//true
		
		
		//primitive vs Wrapper
		Integer age1 = 20;
		int age2 = 20;
		
		System.out.println(age1 == age2);
		System.out.println(age1.equals(age2));
		
		*/
		
		//arrays
		
		String[] animals1 = new String[] {"Dog","Cat","Cow"};
		String[] animals2 = {"Dog","Cat","Cow"};
		String[] animals3 = new String[3];
		animals3[0] = "Dog";
		animals3[1] = "Cat";
		animals3[2] = "Cow";
		String[] animals4 = animals1;
		
		System.out.println("************** == ******************");
		
		System.out.println(animals1 == animals2);//false
		System.out.println(animals1 == animals3);//false
		System.out.println(animals1 == animals4);//true
		System.out.println(animals2 == animals3);//false
		System.out.println(animals2 == animals4);//false
		System.out.println(animals3 == animals4);//false
		
		System.out.println("************** equals() ******************");
		System.out.println(animals1.equals(animals2));//false
		System.out.println(animals1.equals(animals3));//false
		System.out.println(animals1.equals(animals4));//true
		System.out.println(animals2.equals(animals3));//false
		System.out.println(animals2.equals(animals4));//false
		System.out.println(animals3.equals(animals4));//false
		
		
		System.out.println("************** Arrays.equals() ******************");
		System.out.println(Arrays.equals(animals1, animals2));//true
		System.out.println(Arrays.equals(animals1, animals3));//true
		System.out.println(Arrays.equals(animals1, animals4));//true
		System.out.println(Arrays.equals(animals2, animals3));//true
		System.out.println(Arrays.equals(animals2, animals4));//true
		System.out.println(Arrays.equals(animals3, animals4));//true
		
		
	}

}

























