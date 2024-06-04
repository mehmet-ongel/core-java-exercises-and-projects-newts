package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(20);
		ages.add(25);
		ages.add(30);
		
		System.out.println("ages = " + ages);
		
		ArrayList<Object> mixList = new ArrayList<Object>();
		mixList.add("Java");
		mixList.add(10);
		mixList.add(true);
		
		System.out.println("mixList = " + mixList);
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add(2, "Dog");
		animals.add(1,"Cow");
		//Lion, Cow, Cat, Dog
		
		System.out.println("animals = " + animals);
		
		animals.remove(2);//removes element at index 2
		
		System.out.println("animals = " + animals);
		
		animals.remove("Lion");
		
		System.out.println("animals = " + animals);
		
		animals.set(1, "Ant");
		
		System.out.println("animals = " + animals);
		
		ArrayList<String> cars = new ArrayList<String>();
		
		System.out.println(cars.size());
		System.out.println(cars.isEmpty());
		
		cars.add("Mercedes");
		cars.add("Ferrari");
		cars.add("BMW");
		cars.add("Ford");
		
		System.out.println(cars.size());
		System.out.println(cars.isEmpty());
		
		System.out.println(cars.contains("Opel"));//false
		System.out.println(cars.contains("BMW"));//true
		
		cars.clear();
		
		System.out.println(cars.size());
		System.out.println(cars.isEmpty());
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("David");
		names.add("Andy");
		names.add("Clark");
		
		ArrayList<Object> names2 = new ArrayList<Object>();
		names2.add("Clark");
		names2.add("Andy");
		names2.add("David");
		
		System.out.println(names.equals(names2));
		
		//ArrayList<Integer> myList1 = {1,2,3,4,5}; we cannot initialize an ArrayList like Array
		
		

	}

}






















