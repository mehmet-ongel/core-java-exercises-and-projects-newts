package array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		System.out.println("-------------Sorting Double Array----------------");
		//Sorting double array
		double[] array1 = {2.3,11.0,4.6,-3.6,0.8,12};
		System.out.println("unsorted array: " + Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("sorted array: " + Arrays.toString(array1));
		
		System.out.println("-------------Sorting int array-------------------");
		//Sorting int array
		int[] array2 = {1,3,-5,10,2,15,9};
		System.out.println("unsorted array: " + Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("sorted array: " + Arrays.toString(array2));
		
		System.out.println("-------------Sorting char array-------------------");
		//Sorting char array
		char[] array3 = {'F','B','b','H','c','A'};
		System.out.println("unsorted array: " + Arrays.toString(array3));
		Arrays.sort(array3);
		System.out.println("sorted array: " + Arrays.toString(array3));
		
		System.out.println("-------------Sorting String array-------------------");
		//Sorting String array
		String[] array4 = {"cat","Dog","Monkey","Lion","elephant","Cow"};
		System.out.println("unsorted array: " + Arrays.toString(array4));
		Arrays.sort(array4);
		System.out.println("sorted array: " + Arrays.toString(array4));
		
		System.out.println("-------------Sorting String array 2-------------------");
		//Sorting String array 2
		String[] array5 = {"3","300","20","35","37","31","4","70","ant","Zebra"};
		//3 3 2 3 3 3 4 7 -> 20 3 300 31 35 37 4 70 Zebra ant
		System.out.println("unsorted array: " + Arrays.toString(array5));
		Arrays.sort(array5);
		System.out.println("sorted array: " + Arrays.toString(array5));

	}

}
