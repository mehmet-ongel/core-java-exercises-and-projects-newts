package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceExample {

	public static void main(String[] args) {
		
		Queue<String> carsQueue = new LinkedList<String>();
		
		carsQueue.add("Mercedes");//throws an exception
		carsQueue.offer("Ferrari");//doesn't throws an exception
		carsQueue.offer("Ford");
		carsQueue.offer("BMW");
		carsQueue.offer("Opel");
		
		System.out.println("carsQueue = " + carsQueue);
		System.out.println("Size = " + carsQueue.size());
		System.out.println("First element = " + carsQueue.element());//throws an exception
		System.out.println("First element = " + carsQueue.peek());//doesn't throws an exception
		//System.out.println("Removed element = " + carsQueue.poll());//doesn't throws an exception
		System.out.println("carsQueue = " + carsQueue);
		System.out.println("Size = " + carsQueue.size());
		//System.out.println("Removed element = " + carsQueue.remove());//throws an exception
		System.out.println("carsQueue = " + carsQueue);
		System.out.println("Size = " + carsQueue.size());
		
		//FIFO
		int size = carsQueue.size();
		for(int i = 0; i < size; i++) {
			
			System.out.println("Removed element = " + carsQueue.poll());
			
		}
		
		System.out.println("carsQueue = " + carsQueue);
		
		//System.out.println("First element = " + carsQueue.peek());//doesn't throws an exception
		//System.out.println("First element = " + carsQueue.element());//throws an exception
		
		//System.out.println("Removed element = " + carsQueue.poll());//doesn't throws an exception
		//System.out.println("Removed element = " + carsQueue.remove());//throws an exception
		
		
		
		

	}

}
