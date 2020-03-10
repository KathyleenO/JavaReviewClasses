package com.JavaInterviewQuestiona;

public class reverseString {
public static void main(String[] args) {
	
	String toReverse="DUMBO";
	String reverse="";
	
	for(int i=toReverse.length()-1; i>=0; i--) {
		reverse+=toReverse.charAt(i);
	}
	System.out.println(reverse);
	
}
}
