package com.reviewclass11;

public abstract class Human {

	String name;
	int age;
	int weight;
	
	public Human() {
		//super();//it gives deafult constructor of OBject class
		System.out.println("human being created");
	}
	
	public Human(String name) {
		//super(); //for all constructor this super is alwaus there 
	   this(); //calling cosntructor with NO parameter CALL THIS ONE FIRST SO PRINTS FIRST
		this.name=name;
		System.out.println("the name of person is "  +name);
	}
	public Human(String name, int age, int weight) {
	
		this(name);
		//super(name);
		
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public abstract String greeting();
	
	public abstract void talk();
}
