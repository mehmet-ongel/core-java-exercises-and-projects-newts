package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConversionBetweenListArray {

	public static void main(String[] args) {

		//List -> Array
		List<String> animalsList = new ArrayList<String>();
		animalsList.add("Cat");
		animalsList.add("Dog");
		animalsList.add("Cow");
		animalsList.add("Lion");
		
		/*
		String[] animalsArray = new String[animalsList.size()];
		
		
		//for loop
		for(int i = 0; i < animalsList.size(); i++) {
			
			animalsArray[i] = animalsList.get(i);
			
		}*/
		
		//Object[] animalsArray = animalsList.toArray();
		
		//String[] animalsArray = new String[animalsList.size()];
		String[] animalsArray = animalsList.toArray(new String[animalsList.size()]);
		
		animalsList.add("Ant");
		
		System.out.println("animalsList = " + animalsList);
		System.out.println("animalsArray = " + Arrays.toString(animalsArray));
		
		//Array -> List
		String[] carsArray = {"Ferrari", "Mercedes", "BMW", "Ford"};
		
		List<String> carsList = Arrays.asList(carsArray);
		//ArrayList<String> carsList = new ArrayList<String>(Arrays.asList(carsArray));
		
		//ArrayList<String> carsList = new ArrayList<String>();
		
		//Collections.addAll(carsList, carsArray);
		
		/*
		for(String car : carsArray) {
			
			carsList.add(car);
			
		}*/
		
		//carsList.add("Opel");
		
		carsArray[1] = "Hyundai";
		carsList.set(2, "Honda");
		
		System.out.println("carsArray = " + Arrays.toString(carsArray));
		System.out.println("carsList = " + carsList);
		
	}

}












