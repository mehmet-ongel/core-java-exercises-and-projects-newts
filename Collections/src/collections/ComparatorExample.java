package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {
		
		ArrayList<Cars> carsList = new ArrayList<Cars>();
		
		carsList.add(new Cars("Mercedes", 2020, 10000));
		carsList.add(new Cars("BMW", 2018, 12000));
		carsList.add(new Cars("Ferrari", 2025, 20000));
		carsList.add(new Cars("Ford", 2024, 15000));
		carsList.add(new Cars("Opel", 2020, 18000));
		
		Comparator<Cars> comparator = Comparator.comparing(Cars::getPrice);
		
		Collections.sort(carsList, comparator);
		
		for(Cars car : carsList) {
			
			System.out.println(
					"Car: " + car.getCarName() 
					+ "\tYear: " + car.getYear() 
					+ "\tPrice: " + car.getPrice());
			
		}
		
		
		

		/*
		ArrayList<Character> charsList = new ArrayList<Character>();
		charsList.add('b');
		charsList.add('Z');
		charsList.add('A');
		charsList.add('Z');
		charsList.add('d');
		charsList.add('F');
		
		Collections.sort(charsList, new MyChars());
		
		System.out.println("sorted list = " + charsList);
		*/
		
	}

}

class MyChars implements Comparator<Character>{

	@Override
	public int compare(Character o1, Character o2) {
		
		if(o1 < o2) {
			return 1;
		}else if (o1 > o2) {
			return -1;
		}else {
			return 0;
		}
		
		
	}
	
}










