package array;

import java.util.Arrays;

public class SearchingInArrays {

	public static void main(String[] args) {
		
		int[] numbers = {0,12,4,16,18,10};//unsorted array -> output is unpredictable
		int indexOfEight = Arrays.binarySearch(numbers, 8);//4
		System.out.println("index of 8: " + indexOfEight);
		
		int indexOfSeven = Arrays.binarySearch(numbers, 7);// -5
		System.out.println("index of 7: " + indexOfSeven);
		
		Arrays.sort(numbers);
		int indexOfFour = Arrays.binarySearch(numbers, 4);//0 4 10 12 16 18
		System.out.println("index of 4: " + indexOfFour);//1
		
		String[] animals = {"Cat","Cow","Dog","Elephant","Lion","Monkey"};//sorted array -> the output is predictable
		int indexOfDog = Arrays.binarySearch(animals, "Dog");//2
		System.out.println("index of Dog: " + indexOfDog);
		
		//Ant -1
		int indexOfAnt = Arrays.binarySearch(animals, "Ant");//-1
		System.out.println("index of Ant: " + indexOfAnt);

	}

}
