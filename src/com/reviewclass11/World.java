package com.reviewclass11;

public class World {

	
public static void main(String[] args) {
	
//
//				Human person1 = new Human("Andrei");
//				Human person2 = new Human("Salim", 25, 150);
//				
	
	
				System.out.println("---America---");
				//Human person=new Human(); CANNOT CREATE OBJECT WITH ABSTRACT CLASS
				Human person3 = new American("John", 42, 250, "111-22-333");
				person3.talk();
				//person3.taxreturn CAN ACCESS THIS BC ONLY AVAILABLE HUMAN PROPERTIES
				
				American person5=new American("james",5,67,"sghgds");
				//downcasting
				American america=(American) person3; // to use PERSON3 MUST BE instance of American
				
				america.taxReturns();
				
				
				System.out.println("---Albania---");
				Human person4 = new Albanian();
				person4.talk();
				
				Albanian albania=(Albanian) person4;
				
				
				System.out.println();
				System.out.println("The world ended!!!");
			}

	}


