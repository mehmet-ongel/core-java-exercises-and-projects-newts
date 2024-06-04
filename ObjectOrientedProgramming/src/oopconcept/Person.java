package oopconcept;

public class Person {
	
	private String name;
	private double weight;
	private int age;
	private int salary;
	
	//This is a two-parameter constructors
	public Person(String personName, double weight) {
		
		this.name = personName;
		this.weight = weight;
		
	}
	
	//This is a four-parameter constructors
	public Person(String name, int age, double weight, int salary) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.salary = salary;
		
	}
	
	
	//methods
	public void wakeUp() {
		System.out.println(this.name + " woke up.");
	}
	
	public void eat() {
		System.out.println(this.name + " had breakfast.");
		this.weight += 1;
	}
	
	public void doExercise() {
		System.out.println(this.name + " did exercise.");
		this.weight -= 1;
	}
	
	public void showWeight() {
		System.out.println("The current weight of " + this.name + " is " + this.weight + " kg.");
	}
	
	public String toString() {
		
		return "Name: " + this.name + " Age: " + this.age + " Weight: " + this.weight + " Salary: $" + this.salary;
		
	}

}








