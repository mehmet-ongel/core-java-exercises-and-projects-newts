package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceExample {

	public static void main(String[] args) {
		
		/*
		Set<String> animalsSet = new HashSet<String>();
		
		animalsSet.add("Cat");
		animalsSet.add("Dog");
		animalsSet.add("Cow");
		animalsSet.add("Lion");
		animalsSet.add("Ant");
		animalsSet.add("Dog");
		
		System.out.println("animalsSet = " + animalsSet);
		System.out.println("Size of animalsSet = " + animalsSet.size());
		animalsSet.remove("Cow");
		System.out.println("animalsSet = " + animalsSet);
		System.out.println("Contains Sheep ? " + animalsSet.contains("Sheep"));
		
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(12);
		set1.add(13);
		set1.add(17);
		set1.add(18);
		set1.add(16);
		set1.add(14);
		
		System.out.println("set1 = " + set1);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(10);
		set2.add(11);
		set2.add(12);
		set2.add(15);
		set2.add(13);
		set2.add(19);
		set2.add(13);
		
		System.out.println("set2 = " + set2);
		
		//Intersection - retainAll()
		Set<Integer> intersectionSet = new HashSet<Integer>(set1);
		intersectionSet.retainAll(set2);
		System.out.println("intersectionSet = " + intersectionSet);
		
		//Union - addAll()
		Set<Integer> unionSet = new HashSet<Integer>(set1);
		unionSet.addAll(set2);
		System.out.println("union elements = " + unionSet);
		
		//Difference - removeAll()
		Set<Integer> differenceOfSet1FromSet2 = new HashSet<Integer>(set1);
		differenceOfSet1FromSet2.removeAll(set2);
		System.out.println("Elements of Set1 Different From Set2 = " + differenceOfSet1FromSet2);
		
		*/
		
		//HashSet
		System.out.println("**************** HashSet ********************");
		HashSet<String> carsHashSet = new HashSet<String>();
		carsHashSet.add("Mercedes");
		carsHashSet.add("BMW");
		carsHashSet.add("Ferrari");
		carsHashSet.add("Ferrari");
		carsHashSet.add("Ford");
		carsHashSet.add("Opel");
		carsHashSet.add("Opel");
		carsHashSet.add("Honda");
		
		System.out.println("carsHashSet = " + carsHashSet);
		
		//LinkedHashSet
		System.out.println("**************** LinkedHashSet ********************");
		LinkedHashSet<String> carsLinkedHashSet = new LinkedHashSet<String>();
		carsLinkedHashSet.add("Mercedes");
		carsLinkedHashSet.add("BMW");
		carsLinkedHashSet.add("Ferrari");
		carsLinkedHashSet.add("Ferrari");
		carsLinkedHashSet.add("Ford");
		carsLinkedHashSet.add("Opel");
		carsLinkedHashSet.add("Opel");
		carsLinkedHashSet.add("Honda");
		
		System.out.println("carsLinkedHashSet = " + carsLinkedHashSet);
		
		//TreeSet
		System.out.println("**************** TreeSet ********************");
		TreeSet<Character> chars = new TreeSet<Character>();
		chars.add('P');
		chars.add('L');
		chars.add('R');
		chars.add('W');
		chars.add('W');
		chars.add('N');
		chars.add('B');
		chars.add('T');
		chars.add('T');
		chars.add('A');
		
		System.out.println("Descending = " + chars.descendingSet());
		System.out.println("chars = " + chars);
		System.out.println("Headset = " + chars.headSet('N',false));
		System.out.println("Subset = " + chars.subSet('L', 'T'));
		System.out.println("Tailset = " + chars.tailSet('N'));
		System.out.println("First element = " + chars.first());
		System.out.println("Last element = " + chars.last());
		System.out.println("Removed first element = " + chars.pollFirst());
		System.out.println("Removed last element = " + chars.pollLast());
		System.out.println("last version of chars = " + chars);
		

	}

}






















