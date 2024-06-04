package collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInterfaceExample {

	public static void main(String[] args) {
		
		Deque<String> carsDeque = new LinkedList<String>();
		
		carsDeque.add("Mercedes");
		carsDeque.add("BMW");
		carsDeque.add("Ferrari");
		carsDeque.addFirst("Ford");
		carsDeque.addLast("Opel");
		carsDeque.push("Honda");
		carsDeque.offer("Hyundai");
		carsDeque.offerFirst("Kia");
		carsDeque.offerLast("Renault");
		
		System.out.println("carsDeque = " + carsDeque);
		
		System.out.println("Removed element = " + carsDeque.removeFirst());
		
		System.out.println("last version of carsDeque = " + carsDeque);
		
		System.out.println("Removed element = " + carsDeque.removeLast());
		
		System.out.println("last version of carsDeque = " + carsDeque);

	}

}
