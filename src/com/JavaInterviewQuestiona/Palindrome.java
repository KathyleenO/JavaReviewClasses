package com.JavaInterviewQuestiona;

public class Palindrome {
	
public static void main(String[] args) {
	
	String car="civic";
	String reverse= "";
	
	for(int i=car.length()-1; i>=0; i--) {
		reverse=reverse+car.charAt(i);
	}
		if(car.equals(reverse)) {
			System.out.println("Given is palindrome");
		}else {
			System.out.println("not polindrome");
		}
	
	
	
	
	
	
	String l="lol";
	String b= "";
	
	for(int i=l.length()-1; i>=0; i--) {
		b=b+l.charAt(i);
	}
	if(l.equals(b)) {
		System.out.println("si");
	}else {
		System.out.println("no");
	}
	
	
	
	
	
	String original="dad";
	String reversed="";
	
	for(int i= original.length()-1; i>=0; i--) {
		reversed=reversed+original.charAt(i);
	}
	if(original.equals(reversed)){
		System.out.println("PALINDROME");
	}else {
		System.out.println("NOT POLINDROME");
	}
	
	
	
	
	
	
	//REVERSE STRING AND ALSO FIND OUT PALINDROME
	
	String mom="you";
	String reversedd= "";
	
	
	for( int i=mom.length()-1; i>=0; i--) {
		reversedd=reversedd+mom.charAt(i);
	}
//	if(reversedd.equals(mom)) {
//		System.out.println("palindrome YAYYYY");
//	}else {
//		System.out.println("not");
//	}
	
	System.out.println(reversedd);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
