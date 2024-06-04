package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SearchingInLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(19);
		numbersList.add(11);
		numbersList.add(17);
		numbersList.add(15);
		numbersList.add(39);
		numbersList.add(27);
		numbersList.add(22);
		
		Collections.sort(numbersList);// 8 11 15 17 19 22 27 39
		
		System.out.println(Collections.binarySearch(numbersList, 17));
		System.out.println(Collections.binarySearch(numbersList, 27));
		System.out.println(Collections.binarySearch(numbersList, 8));// -1

	}

}
