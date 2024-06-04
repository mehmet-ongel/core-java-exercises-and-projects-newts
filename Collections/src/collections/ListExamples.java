package collections;

import java.util.*;

public class ListExamples {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();//Polymorphism
		
		List<Integer> list2;
		list2 = new ArrayList<Integer>();
		
		//List<double> list3 = new ArrayList<Double>(); we cannot use primitives
		
		Collection<Integer> list4 = new ArrayList<Integer>();
		
		List<String> list5 = new ArrayList();
		list5.add("Hello Java Developers");
		
		String message = list5.get(0);
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add(2, "Dog");
		animals.add(1,"Cow");
		
		System.out.println(animals);
		
		animals.remove(2);
		
		System.out.println(animals);

	}

}
