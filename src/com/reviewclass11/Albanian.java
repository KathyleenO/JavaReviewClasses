package com.reviewclass11;

public class Albanian extends Human {
  
	String albanianID;
	
	public Albanian() {
		
	}
	public Albanian(String name, int age, int weight, String albanianID) {
		super(name, age, weight);
		this.albanianID=albanianID;
	}
	@Override
	public String greeting() {
		
		return " hsse";
	}
	@Override
	public void talk() {
		System.out.println("whatever " +name);
		
		
	}
	
	
}
