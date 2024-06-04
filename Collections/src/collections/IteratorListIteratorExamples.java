package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListIteratorExamples {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		
		int i = 1;
		
		while(i < 51) {
			
			numbersList.add(i);
			i++;
			
		}
		
		System.out.println("numbersList = " + numbersList);
		
		//ListIterator
		ListIterator<Integer> listIterator = numbersList.listIterator();
		
		while(listIterator.hasNext()) {
			
			int indexes = listIterator.nextIndex();
			System.out.print(indexes + " ");
			
			int eachElement = listIterator.next();
			
			if(eachElement % 3 != 0) {
				
				listIterator.set(-1);
				
			}
			
		}
		
		System.out.println();
		System.out.println("newNumbersList = " + numbersList);
		
		
		
		/*
		//Iterator
		Iterator<Integer> iterator = numbersList.iterator();
		
		while(iterator.hasNext()) {
			
			int eachElement = iterator.next();
			
			if(eachElement % 3 != 0) {
				
				iterator.remove();
				
			}
			
		}
		
		System.out.println("newNumbersList = " + numbersList);
		*/

	}

}
